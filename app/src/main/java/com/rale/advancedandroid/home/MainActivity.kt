package com.rale.advancedandroid.home

import com.bluelinelabs.conductor.Controller
import com.rale.advancedandroid.R
import com.rale.advancedandroid.base.BaseActivity
import com.rale.advancedandroid.trending.TrendingReposController

class MainActivity : BaseActivity() {

    override fun layoutRes(): Int = R.layout.activity_main

    override fun initialScreen(): Controller = TrendingReposController()
}
