package com.client.plugin.bytedance.pluginclient;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpHost(View view) {

        // 调用 host 的功能
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.example.bytedance.plugindemo", "com.example.bytedance.plugindemo.Main2Activity"));
        startActivity(intent);
    }
}
