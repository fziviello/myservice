package com.ziviello.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

    @Override
    public IBinder onBind(Intent arg0) {
        Log.e("Service", "onBind");
        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {


        if(intent.getAction()!=null)
        {
            if(intent.getAction().equals("HELLO"))
            {
                Toast.makeText(this, "HELLO", Toast.LENGTH_SHORT).show();

            }
            if(intent.getAction().equals("CIAO"))
            {
                Toast.makeText(this, "CIAO", Toast.LENGTH_SHORT).show();
            }
        }

        super.onStart(intent, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service STOP", Toast.LENGTH_SHORT).show();
        Log.e("Service", "onDestroy");
        super.onDestroy();
    }

}
