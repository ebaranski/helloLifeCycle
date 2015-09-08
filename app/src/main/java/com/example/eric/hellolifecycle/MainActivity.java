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
    //Activity is about to become visible
    //Typical Actions
    // -Start when visible only behaviors
    // -Loading persistent application state
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle:", "onStart called");
    }

    //Activity is visible and about to start interacting with user
    //Typical Actions
    // -Start foreground-only behaviors
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle:", "onResume called");
    }

    //Focus about to switch to another activity
    //Typical Actions
    // -Shutdown foreground-only behaviors
    // -Save persistent state
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle:", "onPause called");
    }

    //Activity is no longer visible to user (may be restarted later)
    // May not be called if Android kills your application
    //Typical Actions
    // -Cache state
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle:", "onStop called");
    }
    //Called if the activity has been stopped and is about to be started
    //Typical actions
    // -Special processing needed only after having been stopped
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle:", "onRestart called");
    }

    //Activity is about to be destroyed
    //May not be called if Android kills your application
    //Typical Actions
    // -Release activity resources
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle:", "onDestroyed called");
    }
}
