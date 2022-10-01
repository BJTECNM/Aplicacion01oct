package com.example.aplicacion01oct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplicacion01oct.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}