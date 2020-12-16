package com.example.clientsregistration;

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.LifecycleObserver
import timber.log.Timber

class ClientsDetails: AppCompatActivity(), LifecycleObserver {
    var clientName : TextView? = null
    var clientSurname : TextView? = null
    var clientThrid_Name : TextView? = null
    var clientPhone : TextView? = null
    var clientEmail : TextView? = null

    private lateinit var dessertTimer: DessertTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        Timber.i("onCreate Called");
        dessertTimer = DessertTimer(this.lifecycle);
        setContentView(R.layout.activity_clients_details);

        clientName = findViewById(R.id.name);
        clientSurname = findViewById(R.id.surname);
        clientThrid_Name = findViewById(R.id.third_name);
        clientPhone = findViewById(R.id.phone);
        clientEmail = findViewById(R.id.email);

        if (savedInstanceState != null) {
            dessertTimer.secondsCount = savedInstanceState.getInt(KEY_TIMER_SECONDS, 0)
        }
    }

    fun back(view: View) {
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(KEY_TIMER_SECONDS, dessertTimer.secondsCount);
        Timber.i("onSaveInstanceState Called");
        super.onSaveInstanceState(outState);
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState);
        Timber.i("onRestoreInstanceState Called");
    }

    /** Lifecycle Methods **/
    override fun onStart() {
        super.onStart();
        Timber.i("onStart Called");
    }

    override fun onResume() {
        super.onResume();
        Timber.i("onResume Called");
    }

    override fun onPause() {
        super.onPause();
        Timber.i("onPause Called");
    }

    override fun onStop() {
        super.onStop();
        Timber.i("onStop Called");
    }

    override fun onDestroy() {
        super.onDestroy();
        Timber.i("Total work time of this activity is:" + dessertTimer.secondsCount)
        Timber.i("onDestroy Called");
    }

    override fun onRestart() {
        super.onRestart();
        Timber.i("onRestart Called");
    }
}