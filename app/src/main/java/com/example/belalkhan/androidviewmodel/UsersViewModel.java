package com.example.belalkhan.androidviewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UsersViewModel extends ViewModel {

    private MutableLiveData<List<User>> userList; //asynchronously取得的data

    //get data
    public LiveData<List<User>> getUsers() {
        if (userList == null) { //如果一開始是空資料
            userList = new MutableLiveData<List<User>>();

            loadUsers(); //use Retrofit to get data
        }
        return userList;
    }

    //Account api's url to get api's data
    private void loadUsers() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);  //call api
        Call<List<User>> call = api.getUsers(); //get all users

        call.enqueue(new Callback<List<User>>(){

            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                userList.setValue(response.body()); //response into userList
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });
    }
}
