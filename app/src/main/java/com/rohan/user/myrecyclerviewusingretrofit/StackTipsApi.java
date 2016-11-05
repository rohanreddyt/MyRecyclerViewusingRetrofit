package com.rohan.user.myrecyclerviewusingretrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by User on 11/3/2016.
 */

public interface StackTipsApi {
    String BASE_URL = "http://stacktips.com/";
    @GET("?json=get_category_posts&slug=news&count=1")
    Call<Data> getData();
    class Factory {
        private static StackTipsApi service;

        public static StackTipsApi getInstance() {
            if (service == null) {
                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(BASE_URL)
                        .build();
                service = retrofit.create(StackTipsApi.class);
                return service;

            } else {
                return service;
            }
        }
    }
}

