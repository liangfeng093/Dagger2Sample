package com.liangfeng093.dagger2sample.scopes

import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * Created by mzf on 2018/2/6.
 * Email:liangfeng093@gmail.com
 */
@Scope//作用域注解       Scope的真正用处就在于Component的组织
@Retention(AnnotationRetention.RUNTIME)//这个注解的的存活时间
annotation class PerActivity()