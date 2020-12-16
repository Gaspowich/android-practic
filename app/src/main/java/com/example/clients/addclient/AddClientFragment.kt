package com.example.clients.addclient;

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.clients.R
import com.example.clients.databinding.FragmentAddClientBinding
import timber.log.Timber


class AddClientFragment : Fragment() {

    private lateinit var binding: FragmentAddClientBinding
    private lateinit var viewModel: AddClientViewModel
    private lateinit var viewModelFactory: AddClientViewModelFactory

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

            binding = DataBindingUtil.inflate(
                    inflater,
                    R.layout.fragment_add_client,
                    container,
                    false
            )

            Timber.i("Called ViewModelProviders.of!");

            viewModelFactory = AddClientViewModelFactory()
            viewModel = ViewModelProviders.of(this, viewModelFactory).get(AddClientViewModel::class.java)

            binding.addClientViewModel = viewModel
            binding.setLifecycleOwner(this)

        return binding.root;
    }
}