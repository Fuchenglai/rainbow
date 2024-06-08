package com.rainbow.android.logic

import androidx.lifecycle.liveData
import com.rainbow.android.logic.model.Place
import com.rainbow.android.logic.network.RainbowNetwork
import kotlinx.coroutines.Dispatchers

/**
 * @Author: 赖富城
 * @CreateTime: 2024/6/8
 * @Description: 仓库层的主要工作就是判断调用方请求的数据应该是从本地数据源中获取还是从网络数据源中获
 * 取，并将获得的数据返回给调用方。仓库层的统一封装入口
 */
object Repository {

    //为了能将异步获取的数据以响应式编程的方式通知给上一层，通 常会返回一个LiveData对象
    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = RainbowNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}
