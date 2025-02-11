package com.prabhakar.carrierguidanceapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("details")
    Call<ResponseModel> getDetails(String text);
}
