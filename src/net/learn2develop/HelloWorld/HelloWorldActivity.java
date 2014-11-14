package net.learn2develop.HelloWorld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
    }
}