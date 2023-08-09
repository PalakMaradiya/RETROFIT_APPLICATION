package com.example.retrofitapplication.ACTIVITY

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitapplication.INTREFACE.ProductIntreface
import com.example.retrofitapplication.OBJECT.RetrofitHelper
import com.example.retrofitapplication.databinding.ActivityRetroFitBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RetroFitActivity : AppCompatActivity() {
    lateinit var binding: ActivityRetroFitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRetroFitBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {


        binding.btnClick.setOnClickListener {

            val Procuteapi = RetrofitHelper.getInstance().create(ProductIntreface::class.java)
            // launching a new coroutine
            GlobalScope.launch {
                val result = Procuteapi.getProduct()
                if (result != null) {
                    // Checking the results
                    Log.e("TAG", "initview data: "+ result.body().toString())
                }
            }

        }

    }
}

