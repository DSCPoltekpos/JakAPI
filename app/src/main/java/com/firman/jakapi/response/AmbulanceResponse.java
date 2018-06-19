package com.firman.jakapi.response;

import java.util.List;

import lombok.Data;

@Data
public class AmbulanceResponse {

    private AmbulanceDatas VEHICLE;
    @Data
    public class AmbulanceDatas {
        private List<AmbulanceData> DATA;
        @Data
        public class AmbulanceData {
            private String LICENSE;
            private String OWNERNAME;
            private String LONGITUDE;
            private String LATITUDE;
            private String ADDRESS;
            private String GSM;
            private String STATUS_ENGINE;
            private String EXP_DATE;
            private String STATUS_EXP;
            private String VEHICLE_STATE;
            private String VEHICLE_TYPE;
        }
    }
}

