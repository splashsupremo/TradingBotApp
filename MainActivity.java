
package com.example.tradingbot;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }
        setContentView(R.layout.activity_main);

        // Run Python script
        Python py = Python.getInstance();
        py.getModule("main").callAttr("start_bot");
    }
}
