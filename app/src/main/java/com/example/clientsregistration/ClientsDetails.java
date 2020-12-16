package com.example.clientsregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ClientsDetails extends AppCompatActivity {
    TextView clientName;
    TextView clientSurname;
    TextView clientThrid_Name;
    TextView clientPhone;
    TextView clientEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clients_details);

        clientName = findViewById(R.id.name);
        clientSurname = findViewById(R.id.surname);
        clientThrid_Name = findViewById(R.id.third_name);
        clientPhone = findViewById(R.id.phone);
        clientEmail = findViewById(R.id.email);
    }


    public void back(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}