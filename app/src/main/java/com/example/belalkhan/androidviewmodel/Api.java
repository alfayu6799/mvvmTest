package com.example.belalkhan.androidviewmodel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://api.github.com/";

    @GET("users?per_page=100") //每100筆分一頁
    Call<List<User>> getUsers();
}
