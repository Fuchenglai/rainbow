package com.rainbow.android.logic.network

import com.rainbow.android.RainbowApplication
import com.rainbow.android.logic.model.DailyResponse
import com.rainbow.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @Author: 赖富城
 * @CreateTime: 2024/6/8
 * @Description:
 */
interface WeatherService {
    @GET("v2.5/${RainbowApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<RealtimeResponse>
    @GET("v2.5/${RainbowApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<DailyResponse>
}
