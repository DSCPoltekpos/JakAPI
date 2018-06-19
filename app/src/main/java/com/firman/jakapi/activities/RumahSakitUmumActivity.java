package com.firman.jakapi.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.firman.jakapi.R;
import com.firman.jakapi.adapter.RumahSakitUmumAdapter;
import com.firman.jakapi.network.RetrofitConfig;
import com.firman.jakapi.network.ServiceApi;
import com.firman.jakapi.response.RumahSakitUmumResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class RumahSakitUmumActivity extends AppCompatActivity {

    @BindView(R.id.recycler_rumahsakitumum)
    RecyclerView recyclerRumahsakitumum;
    @BindView(R.id.progress_rumahsakitumum)
    ProgressBar progressRumahsakitumum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah_sakit_umum);
        ButterKnife.bind(this);
        setTitle("Daftar Rumah Sakit Umum");
        ServiceApi api = RetrofitConfig.getInstance();
        Call<RumahSakitUmumResponse> rumahSakitUmumResponseCall = api.getRumahSakitUmum();
        rumahSakitUmumResponseCall.enqueue(new Callback<RumahSakitUmumResponse>() {
            @Override
            public void onResponse(Call<RumahSakitUmumResponse> call, Response<RumahSakitUmumResponse> response) {
                progressRumahsakitumum.setVisibility(View.VISIBLE);
                if (response.isSuccessful()) {
                    progressRumahsakitumum.setVisibility(View.GONE);
                    recyclerRumahsakitumum.setAdapter(new RumahSakitUmumAdapter(getApplicationContext(), response.body().getData()));
                }
            }

            @Override
            public void onFailure(Call<RumahSakitUmumResponse> call, Throwable t) {

            }
        });
    }
}
