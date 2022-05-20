package com.example.surokhaapp.Retrofit;

import com.example.surokhaapp.ModelClass.ModelClass;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("insert.php")
    Call<ModelClass>insert(@Body ModelClass modelClass);



}