package com.prabhakar.carrierguidanceapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("details")
    Call<List<ResponseModel>> getDetails(@Query("role") String text);
}
