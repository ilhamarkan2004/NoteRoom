package com.example.lazyroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.lazyroom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        setupListener()

        binding.root
    }
    fun setupListener(){
    binding.buttonCreate.setOnClickListener{
        startActivity(Intent(this,EditActivity::class.java))
    }
    }
}