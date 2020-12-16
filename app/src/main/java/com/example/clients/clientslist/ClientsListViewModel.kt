package com.example.clients.clientslist

import androidx.lifecycle.ViewModel
import timber.log.Timber

class ClientsListViewModel : ViewModel() {

    var clients = arrayOf( "John", "James", "Jack", "Sidni", "Courtney")

    init {
        Timber.i("ContactsListViewModel");
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("ContactsListViewModel destroyed");
    }
}