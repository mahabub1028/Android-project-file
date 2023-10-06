package com.example.fetchdata_retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface mayapi {

   @GET("posts")
    Call<List<model>> getmodels();
}
