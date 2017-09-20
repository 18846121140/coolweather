package com.coolweather.android.gson;

/**
 * Created by lixiankun on 2017/9/19.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
