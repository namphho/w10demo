package com.hnam.w10demo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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


    var count : MutableLiveData<Int> = MutableLiveData(initValue)

    fun clickAdd(){
        count.value = count.value?.plus(1)
    }

    override fun onCleared() {
        super.onCleared()
        Log.e(TAG, "clear view model")
    }
}