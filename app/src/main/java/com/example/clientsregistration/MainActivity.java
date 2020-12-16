package com.example.clientsregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activity_main, new СlientsListFragment())
                    .commit();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();
            switch(id){
                case R.id.terms_using :
                    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, new UsingTermsFragment()).commit();
                    return true;
                case R.id.action_about:
                    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, new AboutFragment()).commit();
                    return true;
                case R.id.add_client:
                    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, new AddClient()).commit();
                    return  true;
            }
            return super.onOptionsItemSelected(item);
    }
}