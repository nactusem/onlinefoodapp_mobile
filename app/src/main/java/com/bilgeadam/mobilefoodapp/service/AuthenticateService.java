package com.bilgeadam.mobilefoodapp.service;

import com.bilgeadam.mobilefoodapp.dto.JwtTokenRequest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthenticateService {

    @POST("/authenticate")
    Call<ResponseBody> authenticate(@Body JwtTokenRequest jwtTokenRequest);
}