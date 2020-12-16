package com.example.clients.addclient

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class AddClientViewModel : ViewModel() {

    private val _clientName = MutableLiveData<String>()
    val clientName : LiveData<String>
        get() = _clientName

    private val _clientSurname = MutableLiveData<String>()
    val clientSurname : LiveData<String>
        get() = _clientSurname

    private val _clientThrid_Name = MutableLiveData<String>()
    val clientThrid_Name : LiveData<String>
        get() = _clientThrid_Name

    private val _clientPhone  = MutableLiveData<String>()
    val clientPhone : LiveData<String>
        get() = _clientPhone

    private val _email  = MutableLiveData<String>()
    val email : LiveData<String>
        get() = _email

    init {
        Timber.i("AddContactViewModel Created");
        _clientName.value = ""
        _clientSurname.value = ""
        _clientThrid_Name.value = ""
        _clientPhone.value = ""
        _email.value = ""
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("AddContactViewModel destroyed");
    }
}