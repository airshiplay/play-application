package com.airlenet.play.http;

import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.Map;

/**
 * @author airlenet
 * @version 2017-12-19
 */
public class Main {
    public static void main(String args[]) throws IOException {
        TestApi testApi = PlayHttpClient.getApi(TestApi.url, TestApi.class);
        Response<Map<String,String>> ipjson = testApi.getGeoByIpjson("1", "").execute();
        System.out.print(ipjson.body());
    }
}
