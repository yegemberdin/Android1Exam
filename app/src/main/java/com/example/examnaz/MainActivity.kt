package com.example.examnaz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var usd_button: Button? = null
    var eur_button: Button? = null
    var gbp_button: Button? = null
    var rub_button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usd_button = findViewById(R.id.USD_button)
        usd_button!!.setOnClickListener(this)
        eur_button = findViewById(R.id.EUR_button)
        eur_button!!.setOnClickListener(this)
        gbp_button = findViewById(R.id.GBP_button)
        gbp_button!!.setOnClickListener(this)
        rub_button = findViewById(R.id.RUB_button)
        rub_button!!.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val intent = Intent(this, DetailsActivity::class.java)
        when (v!!.id) {
            R.id.USD_button -> {
                intent.putExtra("key", "USD")
                startActivity(intent)
            }

            R.id.EUR_button -> {
                intent.putExtra("key", "EUR")
                startActivity(intent)

            }

            R.id.GBP_button -> {
                intent.putExtra("key", "GBP")
                startActivity(intent)

            }

            R.id.RUB_button -> {
                intent.putExtra("key", "RUB")
                startActivity(intent)

            }
            else -> {}
        }
    }
}
