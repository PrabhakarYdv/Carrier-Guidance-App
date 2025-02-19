package com.prabhakar.carrierguidanceapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("90d2b7e8-5bb0-4bdb-a286-64d421e2c288")
    Call<List<ResponseModel>> getDetails(@Query("role") String text);
}
