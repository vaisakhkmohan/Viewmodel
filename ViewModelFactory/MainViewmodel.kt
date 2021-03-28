package com.vaisakh.hustler.viewmodelfactory

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewmodel(name : String) : ViewModel() {

    var myname : String = name

    init {
        Log.e(TAG, "Viewmodel argment : $myname" )
    }

}