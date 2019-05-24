package com.rale.advancedandroid.base;

import com.rale.advancedandroid.data.RepoServiceModule;
import com.rale.advancedandroid.networking.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
        ServiceModule.class,
        RepoServiceModule.class,
})
public interface ApplicationComponent {
    void inject(MyApplication myApplication);
}
