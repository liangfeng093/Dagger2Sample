package com.liangfeng093.dagger2sample.components

import com.liangfeng093.dagger2sample.modules.ActivityModule
import com.liangfeng093.dagger2sample.scopes.PerActivity
import dagger.Component

/**
 * Created by mzf on 2018/2/6.
 * Email:liangfeng093@gmail.com
 */
@PerActivity
//@Component(dependencies = AppComponent.class,modules = {MainModule.class, ActivityModule.class})
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface MainComponent {

}