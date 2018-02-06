package com.liangfeng093.dagger2sample.modules

import android.app.Activity
import com.liangfeng093.dagger2sample.scopes.PerActivity
import dagger.Module
import dagger.Provides

/**
 * Created by mzf on 2018/2/6.
 * Email:liangfeng093@gmail.com
 */
@Module
class ActivityModule {
    var activity: Activity? = null

    constructor(activity: Activity?) {
        this.activity = activity
    }

    @Provides
    @PerActivity
    fun provideActivity(): Activity? {
        return activity
    }
}