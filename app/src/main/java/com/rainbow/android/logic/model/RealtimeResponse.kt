package com.rainbow.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @Author: 赖富城
 * @CreateTime: 2024/6/8
 * @Description:
 */
data class RealtimeResponse(val status: String, val result: Result) {
    data class Result(val realtime: Realtime)
    data class Realtime(
        val skycon: String, val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)
    data class AQI(val chn: Float)
}
