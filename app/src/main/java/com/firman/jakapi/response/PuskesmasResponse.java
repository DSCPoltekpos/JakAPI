package com.firman.jakapi.response;

import java.util.List;

import lombok.Data;

@Data
public class PuskesmasResponse {

    private List<PuskesmasData> data;

    @Data
    public class PuskesmasData {
        private String nama_Puskesmas;
        private Location location;
        private List<String> telepon;
        private List<String> faximile;
        private String email;
        private String kepala_puskesmas;

        @Data
        public class Location {
            private String alamat;
            private double latitude;
            private double longitude;
        }
    }

}
