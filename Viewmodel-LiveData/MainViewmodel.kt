package com.vaisakh.hustler.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewmodel : ViewModel() {

    private var number: MutableLiveData<String>?= null
    fun getnumber() : MutableLiveData<String>{
        if (number == null){
            number = MutableLiveData<String>()
            setNumber()
        }
        return number!!
    }
    fun setNumber() {
          var random = Random
        number!!.value = "number ${random.nextInt(100-1)+1}"
    }
    override fun onCleared() {
        super.onCleared()
    }
}