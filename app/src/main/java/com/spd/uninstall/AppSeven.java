package com.spd.uninstall;

import android.annotation.SuppressLint;
import android.app.Application;

/**
 * @author xuyan
 */
public class AppSeven extends Application {

    @SuppressLint("StaticFieldLeak")
    private static AppSeven sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

    }

    public static AppSeven getInstance() {
        return sInstance;
    }

}

