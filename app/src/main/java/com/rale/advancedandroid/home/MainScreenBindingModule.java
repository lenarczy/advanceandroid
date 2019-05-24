package com.rale.advancedandroid.home;

import com.bluelinelabs.conductor.Controller;
import com.rale.advancedandroid.di.ControllerKey;
import com.rale.advancedandroid.trending.TrendingReposComponent;
import com.rale.advancedandroid.trending.TrendingReposController;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        TrendingReposComponent.class,
})
public abstract class MainScreenBindingModule {

    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller> bindTrendingReposInjector(TrendingReposComponent.Builder builder);
}
