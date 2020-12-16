package com.example.clients.clientdetails

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClientsDetailsViewModel : ViewModel() {

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
        _clientName.value = "John"
        _clientSurname.value = "Jona"
        _clientThrid_Name.value = "Jameson"
        _clientPhone.value = "+84154544"
        _email.value = "jameson@info.com.us"
    }

    override fun onCleared() {
        super.onCleared()
    }
}