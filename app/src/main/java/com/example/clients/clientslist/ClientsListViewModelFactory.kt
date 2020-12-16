package com.example.clients.clientslist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ClientsListViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ClientsListViewModel::class.java)) {
            return ClientsListViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}