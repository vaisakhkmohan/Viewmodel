package com.vaisakh.hustler.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class Mainviewmodelfactory(private var name : String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewmodel::class.java)) {
            return MainViewmodel(name) as T
        }
        throw IllegalArgumentException("Viewmodel not found")
    }
}