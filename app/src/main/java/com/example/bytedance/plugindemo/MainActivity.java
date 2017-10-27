package com.example.bytedance.plugindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.qihoo360.replugin.RePlugin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpClient(View view) {

        // 调用起 client plugin
        RePlugin.startActivity(this, new Intent(), "client", "com.client.plugin.bytedance.pluginclient.MainActivity");

    }
}
