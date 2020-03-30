package com.ziviello.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import static com.ziviello.myservice.MainActivity.ACTION_CIAO;
import static com.ziviello.myservice.MainActivity.ACTION_HELLO;

public class MyService extends Service {

    @Override
    public void onCreate() {
        Log.e("MyService", "onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.e("MyService", "onStartCommand");

        if (intent.getAction() != null) {

            Log.e("MyService", "getAction: " + intent.getAction() );

            if (intent.getAction().equals(ACTION_HELLO)) {
                Toast.makeText(this, "RECEIVED: " + ACTION_HELLO, Toast.LENGTH_SHORT).show();
            }
            else if (intent.getAction().equals(ACTION_CIAO)) {
                Toast.makeText(this, "RECEIVED: " + ACTION_CIAO, Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "ACTION NOT MAPPED: " + intent.getAction(), Toast.LENGTH_SHORT).show();
            }

        }

        return startId;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("MyService", "onBind");
        return null;
    }

    @Override
    public void onDestroy() {
        Log.e("Service", "onDestroy");
        Toast.makeText(this, "Service STOP", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}