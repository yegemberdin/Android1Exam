package com.example.examnaz;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ServerApi {
    @GET("latest?base=EUR")
    Call<List<Data>> getDetailsEUR();
    @GET("latest?base=USD")
    Call<ListWrapper<Data>> getDetailsUSD();
    @GET("latest?base=RUB")
    Call<List<Data>> getDetailsRUB();
    @GET("latest?base=GBP")
    Call<List<Data>> getDetailsGBP();
}
