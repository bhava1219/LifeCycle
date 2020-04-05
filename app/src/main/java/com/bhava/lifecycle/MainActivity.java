package com.bhava.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(getApplicationContext().toString(),"OnStart");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(getApplicationContext().toString(),"OnStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(getApplicationContext().toString(),"OnDestroy");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(getApplicationContext().toString(),"OnPause");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(getApplicationContext().toString(),"OnResume");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(getApplicationContext().toString(),"OnRestart");
    }
}
