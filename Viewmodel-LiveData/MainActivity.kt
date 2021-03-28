package com.vaisakh.hustler.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myviewmodel : MainViewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myviewmodel = ViewModelProvider(this).get(MainViewmodel::class.java)
        var rannum: LiveData<String>  =myviewmodel.getnumber()
        button.setOnClickListener {
            myviewmodel.setNumber()
        }
        rannum.observe(this, Observer {
            numbers.text = it
        })

    }
}


