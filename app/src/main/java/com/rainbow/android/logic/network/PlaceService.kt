package com.rainbow.android.logic.network

import com.rainbow.android.RainbowApplication
import com.rainbow.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @Author: 赖富城
 * @CreateTime: 2024/6/7
 * @Description:
 */
interface PlaceService {
    @GET("v2/place?token=${RainbowApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}
