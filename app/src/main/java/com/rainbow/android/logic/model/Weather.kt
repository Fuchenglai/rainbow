package com.rainbow.android.logic.model

/**
 * @Author: 赖富城
 * @CreateTime: 2024/6/8
 * @Description:
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)
