package com.coolweather.android.gson;

/**
 * Created by jinzhicheng on 2017/10/25.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
