package com.sheeda.sampleapp;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class ConsoliSampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
