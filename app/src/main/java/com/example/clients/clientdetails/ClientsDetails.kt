package com.example.clients.clientdetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.clients.R
import com.example.clients.databinding.FragmentClientsDetailsBinding


class ClientsDetails: Fragment() {
    private lateinit var binding: FragmentClientsDetailsBinding
    private lateinit var viewModel: ClientsDetailsViewModel
    private lateinit var viewModelFactory: ClientsDetailsViewModelFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_clients_details,
                container,
                false
        )

        viewModelFactory = ClientsDetailsViewModelFactory()
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ClientsDetailsViewModel::class.java)

        binding.clientsDetailsViewModel = viewModel
        binding.setLifecycleOwner(this)

        return  binding.root
    }
}