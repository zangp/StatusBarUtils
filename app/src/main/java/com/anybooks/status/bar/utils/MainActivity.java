package com.anybooks.status.bar.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = "hello!!";
        Log.d("zp_test", name);
        String age = "develop";
        Log.d("zp_test", age);
    }
}
