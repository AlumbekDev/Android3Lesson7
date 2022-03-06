package com.example.android3lesson7.network.apis;



import com.example.android3lesson7.network.network_model.responses.pixabay.PixabayResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PixabayApi {
    @GET("/api?key=25678452-c644ee6efc6979cc35175839e")
    Call<PixabayResponse> getVideos(@Query("q") String keyWord);
}
