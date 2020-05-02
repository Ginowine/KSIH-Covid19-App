package com.android.ksih_covid_19_app.ui.symptoms

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class PreventionViewModelFactory(private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PreventionViewModel::class.java)){

            return PreventionViewModel(application) as T
    }
    throw IllegalArgumentException("Unknown ViewModel class")
}
}