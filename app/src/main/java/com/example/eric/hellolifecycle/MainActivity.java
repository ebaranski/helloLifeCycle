package com.example.eric.hellolifecycle;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Lifecycle:", "onCreate called");
    }

    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle:", "onStart called");
    }

    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle:", "onResume called");
    }

    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle:", "onPause called");
    }

    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle:", "onStop called");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle:", "onRestart called");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle:", "onDestroy called");
    }
}
