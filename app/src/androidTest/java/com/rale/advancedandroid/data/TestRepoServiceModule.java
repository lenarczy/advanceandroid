package com.rale.advancedandroid.data;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class TestRepoServiceModule {

    @Binds
    abstract RepoService bindRepoService(TestRepoService repoService);
}
