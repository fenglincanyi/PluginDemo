package com.example.bytedance.plugindemo;

import android.content.Context;

import com.qihoo360.replugin.RePlugin;
import com.qihoo360.replugin.RePluginApplication;

/**
 * Created by gengjiarong on 2017/10/27.
 */

public class MainApplication extends RePluginApplication {

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        RePlugin.enableDebugger(base, BuildConfig.DEBUG);
    }
}