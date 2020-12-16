package com.example.clients.clientslist;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.clients.R
import com.example.clients.clientdetails.ClientsDetails


class ClientsListFragment : Fragment() {

    private lateinit var viewModel: ClientsListViewModel
    private  lateinit var viewModelFactory: ClientsListViewModelFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var view : View = inflater?.inflate(R.layout.fragment_clients_list, container, false);

        viewModelFactory = ClientsListViewModelFactory()
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ClientsListViewModel::class.java)


        var clientsList:ListView =  view?.findViewById(R.id.clientsList);

        var adapter = ArrayAdapter<String>(view.getContext(),
                android.R.layout.simple_list_item_1, viewModel.clients);

        clientsList.setAdapter(adapter);
        clientsList.setOnItemClickListener { parent, view, position, id ->
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.activity_main, ClientsDetails())?.commit()
         }

        return  view;
    }
}