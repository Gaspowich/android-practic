package com.example.clientsregistration;

import android.app.Application;
import timber.log.Timber;

public class ClientsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}