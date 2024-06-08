package com.rainbow.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @Author: 赖富城
 * @CreateTime: 2024/6/7
 * @Description:Android提供了一个Application类，每当应用程序启动的时候，系统就会自动将这个类进行
 * 初始化。而我们可以定制一个自己的Application类，以便于管理程序内一些全局的状态信息，比如全局Context
 */
class RainbowApplication:Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        //彩云天气的令牌值
        const val TOKEN= "8quxsUetrI4Q0Fsx"
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
