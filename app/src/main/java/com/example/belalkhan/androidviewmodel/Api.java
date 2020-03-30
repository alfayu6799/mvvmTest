package com.example.belalkhan.androidviewmodel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://api.github.com/"; //api路徑

    @GET("users?per_page=100")      //Account api documentation, 使用GET連線,每100筆分一頁
    Call<List<User>> getUsers();   //取得的回傳資料用User類別物件接收，連線名稱取為getUsers
}
