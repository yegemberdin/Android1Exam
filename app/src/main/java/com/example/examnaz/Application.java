package com.example.examnaz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Application extends android.app.Application {

    private Retrofit retrofit;
    public static ServerApi api;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://api.exchangeratesapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api=retrofit.create(ServerApi.class);

    }
}
