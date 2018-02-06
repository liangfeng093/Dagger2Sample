package com.liangfeng093.dagger2sample.modules

import dagger.Module
import dagger.Provides

/**
 * Created by mzf on 2018/2/6.
 * Email:liangfeng093@gmail.com
 */
@Module
class MainModule {
    @Provides
    fun provideUserData(){
        return  GetUserData()
    }
}