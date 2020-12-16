package com.example.clientsregistration;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddClient extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add_client, container, false);

        Button saveButton = (Button) view.findViewById(R.id.button);

        final EditText clientName = (EditText) view.findViewById(R.id.name);
        final EditText clientSurname = (EditText) view.findViewById(R.id.surname);
        final EditText clientThrid_Name = (EditText) view.findViewById(R.id.third_name);
        final EditText clientPhone = (EditText) view.findViewById(R.id.phone);
        final EditText clientEmail = (EditText) view.findViewById(R.id.phone);

        EditText[] inputArr = {clientName, clientSurname, clientThrid_Name, clientPhone, clientEmail};
        this.focusEdit(inputArr);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(view.getContext(), "Click",Toast.LENGTH_LONG);
                toast.show();
            }
        });

        return view;
    }

    private void focusEdit(EditText[] inputArr) {
        int length = inputArr.length;
        for(int i = 0; i < length; i++ ) {
            final EditText input = inputArr[i];
            input.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean hasFocus) {
                    if (hasFocus) {
                        input.setBackgroundResource(R.drawable.edit_text_border);
                    }
                }
            });
        }
    }
}