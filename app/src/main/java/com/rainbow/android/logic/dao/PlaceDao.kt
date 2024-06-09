package com.rainbow.android.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.rainbow.android.RainbowApplication
import com.rainbow.android.logic.model.Place

/**
 * @Author: 赖富城
 * @CreateTime: 2024/6/9
 * @Description:
 */
object PlaceDao {

    /**
     * 将Place对象存储到SharedPreferences文件中
     */
    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }
    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }
    fun isPlaceSaved() = sharedPreferences().contains("place")
    private fun sharedPreferences() = RainbowApplication.context.
    getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}
