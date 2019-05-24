package com.rale.advancedandroid.data;

import com.rale.advancedandroid.test.TestUtils;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

@Singleton
public class TestRepoService implements RepoService {

    private boolean sendError;
    private final TestUtils testUtils;

    @Inject
    TestRepoService(TestUtils testUtils) {
        this.testUtils = testUtils;
    }

    @Override
    public Single<TrendingReposResponse> getTrendingRepos() {
        if (sendError) {
            return Single.error(new IOException());
        } else {
            TrendingReposResponse trendingReposResponse = testUtils.loadJson("mock/get_trending_repos.json", TrendingReposResponse.class);
            return Single.just(trendingReposResponse);
        }
    }

    public void setSendError(boolean sendError) {
        this.sendError = sendError;
    }
}
