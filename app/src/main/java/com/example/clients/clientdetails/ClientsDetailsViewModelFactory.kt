package com.example.clients.clientdetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ClientsDetailsViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ClientsDetailsViewModel::class.java)) {
            return ClientsDetailsViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}