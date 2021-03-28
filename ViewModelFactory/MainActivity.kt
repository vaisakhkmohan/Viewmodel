package com.vaisakh.hustler.viewmodelfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mainvmfactory = Mainviewmodelfactory("vaisakh.k.mohan")
        ViewModelProvider(this , mainvmfactory).get(MainViewmodel::class.java)

    }

}