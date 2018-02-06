package com.liangfeng093.dagger2sample.components

import android.app.Activity
import com.liangfeng093.dagger2sample.modules.ActivityModule
import com.liangfeng093.dagger2sample.scopes.PerActivity
import dagger.Component

/**
 * Created by mzf on 2018/2/6.
 * Email:liangfeng093@gmail.com
 */
@PerActivity
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun getActivity(): Activity
}