package com.rale.advancedandroid.base;

import android.support.annotation.NonNull;
import android.support.test.InstrumentationRegistry;

public class TestApplication extends MyApplication {

    @NonNull
    @Override
    protected ApplicationComponent initComponent() {
        return DaggerTestApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static TestApplicationComponent getComponent() {
        return (TestApplicationComponent)
                ((TestApplication) InstrumentationRegistry.getTargetContext().getApplicationContext()).component;
    }
}
