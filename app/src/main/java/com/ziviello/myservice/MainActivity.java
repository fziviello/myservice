package com.ziviello.myservice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctx=this;
        Button btn_hello = findViewById(R.id.btn_HELLO);
        Button btn_ciao = findViewById(R.id.btn_CIAO);

        btn_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ctx, MyService.class);
                myIntent.setAction("HELLO");
                startService(myIntent);
            }
        });

        btn_ciao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ctx, MyService.class);
                myIntent.setAction("CIAO");
                startService(myIntent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
