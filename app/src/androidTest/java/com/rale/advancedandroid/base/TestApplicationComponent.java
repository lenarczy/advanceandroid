package com.rale.advancedandroid.base;

import com.rale.advancedandroid.trending.TrendingReposControllerTest;
import com.rale.advancedandroid.data.TestRepoServiceModule;
import com.rale.advancedandroid.networking.ServiceModule;
import com.rale.advancedandroid.ui.NavigationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        TestActivityBindingModule.class,
        TestRepoServiceModule.class,
        ServiceModule.class,
        NavigationModule.class,
})
public interface TestApplicationComponent extends ApplicationComponent {
    void inject(TrendingReposControllerTest trendingReposControllerTest);
}

