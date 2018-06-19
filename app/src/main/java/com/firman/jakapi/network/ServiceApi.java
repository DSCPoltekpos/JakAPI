package com.firman.jakapi.network;

import com.firman.jakapi.response.AmbulanceResponse;
import com.firman.jakapi.response.PuskesmasResponse;
import com.firman.jakapi.response.RumahSakitKhususResponse;
import com.firman.jakapi.response.RumahSakitUmumResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ServiceApi {
    @Headers({"Authorization: " + "5h30dB4K4Uwuhj4KkmHmFuOgeIeo+XxK4jKRm/v5lNNfbGfsYx2wB2D4IKQWaSu7"})
    @GET("puskesmas")
    Call<PuskesmasResponse> getPuskesmas();

    @Headers({"Authorization: " + "5h30dB4K4Uwuhj4KkmHmFuOgeIeo+XxK4jKRm/v5lNNfbGfsYx2wB2D4IKQWaSu7"})
    @GET("emergency/ambulance")
    Call<AmbulanceResponse> getAmbulance();

    @Headers({"Authorization: " + "5h30dB4K4Uwuhj4KkmHmFuOgeIeo+XxK4jKRm/v5lNNfbGfsYx2wB2D4IKQWaSu7"})
    @GET("rumahsakitkhusus")
    Call<RumahSakitKhususResponse> getRumahSakitKhusus();

    @Headers({"Authorization: " + "5h30dB4K4Uwuhj4KkmHmFuOgeIeo+XxK4jKRm/v5lNNfbGfsYx2wB2D4IKQWaSu7"})
    @GET("rumahsakitumum")
    Call<RumahSakitUmumResponse> getRumahSakitUmum();
}

