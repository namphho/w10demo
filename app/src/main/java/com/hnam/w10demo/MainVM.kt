package com.hnam.w10demo

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * Created by nampham on 6/24/20.
 */

class MainVM(initValue : Int) : ViewModel(){
    companion object {
        private val TAG = MainVM::class.java.simpleName
    }
    init {
        Log.e(TAG, "init view model")
    }


    var count : Int = initValue

    fun clickAdd(){
        count++
    }

    override fun onCleared() {
        super.onCleared()
        Log.e(TAG, "clear view model")
    }
}