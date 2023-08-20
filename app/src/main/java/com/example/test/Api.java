package com.example.test;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Api {
    String BASE_URL = "https://64d9dec8e947d30a260a68d0.mockapi.io/";
    Api instance = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api.class);
    @GET("api/hihi")
    Call<List<Comic>> getAllComic();

    @POST("api/hihi")
    Call<Comic> addComic(@Body Comic comic);

    @PUT("api/hihi/{id}")
    Call<Comic> editComic(@Path("id") String id, @Body Comic comic);

    @DELETE("api/hihi/{id}")
    Call<Void> deleteComic(@Path("id") String id);
}
