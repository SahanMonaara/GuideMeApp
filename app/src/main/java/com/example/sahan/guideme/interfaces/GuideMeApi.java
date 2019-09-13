package com.example.sahan.guideme.interfaces;

import com.example.sahan.guideme.models.Model;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface GuideMeApi {
    @POST("api/locations")
    Call<Model> saveLocation(@Body Model model);
}
