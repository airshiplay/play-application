package com.airlenet.play.http;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.Map;

/**
 * @author airlenet
 * @version 2017-12-19
 */
public interface TestApi {
    public static final String url = "http://api.map.baidu.com/";
    @GET("location/ip?coor=bd09ll")
    public Call<Map<String,String>> getGeoByIpjson(@Query("ak") String ak, @Query("ip") String ip);

}
