package com.example.clientsregistration;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class СlientsListFragment extends Fragment {
    String[] clients = { "John", "James", "Jack", "Sergey", "MC.Queen"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_clients_list, container, false);
        ListView clientsList = (ListView) view.findViewById(R.id.clientsList);
        final Intent intent = new Intent(view.getContext(), ClientsDetails.class);

        ArrayAdapter<String> adapter = new ArrayAdapter(view.getContext(),
                android.R.layout.simple_list_item_1, clients);

        clientsList.setAdapter(adapter);

        clientsList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                startActivity(intent);
            }
        });

        return  view;
    }
}