package com.hnam.w10demo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by nampham on 6/25/20.
 */

class MainVMFactory(private val initValue: Int) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainVM::class.java)){
            return MainVM(initValue) as T
        }
        throw IllegalArgumentException("unknown class")
    }

}