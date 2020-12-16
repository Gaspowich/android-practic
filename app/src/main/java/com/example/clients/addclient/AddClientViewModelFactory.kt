package com.example.clients.addclient

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class AddClientViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel ?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(AddClientViewModel::class.java)) {
            return AddClientViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}