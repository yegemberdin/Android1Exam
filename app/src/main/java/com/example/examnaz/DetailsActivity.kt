package com.example.examnaz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_details.*
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailsActivity : AppCompatActivity() {
    var txt1: TextView?=null;
    var txt2:TextView?=null
    var txt3:TextView?=null
    var txt4:TextView?=null

    var txt1Usd:TextView?=null


    var data: MutableList<Data>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val intent = intent
        val currencyNameIntent = intent.getStringExtra("key")
        setSupportActionBar(toolbar_actionbar)
        val actionBar = supportActionBar
        actionBar!!.title = currencyNameIntent

        txt1=findViewById(R.id.text1)
        txt2=findViewById(R.id.text2)
        txt3=findViewById(R.id.text3)
        txt4=findViewById(R.id.text4)

        if(currencyNameIntent=="USD"){

            Application.api.detailsUSD.enqueue(object: Callback<ListWrapper<Data>>{
                override fun onFailure(call: Call<ListWrapper<Data>>, t: Throwable) {
                    Log.d("error", t.toString())
                }

                override fun onResponse(call: Call<ListWrapper<Data>>, response: Response<ListWrapper<Data>>) {
                    Log.d("responseBody", " is "+ response.body())
                    data=ArrayList()
                    data!!.addAll(response.body()!!.rates)
                    // здесь с помощью геттера достаем значения и передаем вижибилити виюшек согласно base url и сеттим в текствиюшки
//везде так делаем



                }

            })
        }
        else if(currencyNameIntent=="EUR"){
            Application.api.detailsEUR.enqueue(object: Callback<List<Data>>{
                override fun onFailure(call: Call<List<Data>>, t: Throwable) {
                    Log.d("error", t.toString())
                }

                override fun onResponse(call: Call<List<Data>>, response: Response<List<Data>>) {
                    Log.d("responseBody", " is "+ response.body())
                }

            })
        }
        else if(currencyNameIntent=="GBP"){
            Application.api.detailsGBP.enqueue(object: Callback<List<Data>>{
                override fun onFailure(call: Call<List<Data>>, t: Throwable) {
                    Log.d("error", t.toString())
                }

                override fun onResponse(call: Call<List<Data>>, response: Response<List<Data>>) {
                    Log.d("responseBody", " is "+ response.body())
                }

            })
        }
        else if(currencyNameIntent=="RUB"){
            Application.api.detailsRUB.enqueue(object: Callback<List<Data>>{
                override fun onFailure(call: Call<List<Data>>, t: Throwable) {
                    Log.d("error", t.toString())
                }

                override fun onResponse(call: Call<List<Data>>, response: Response<List<Data>>) {
                    Log.d("responseBody", " is "+ response.body())
                }

            })
        }





    }
}
