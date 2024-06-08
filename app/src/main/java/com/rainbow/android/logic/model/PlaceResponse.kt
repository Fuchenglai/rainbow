package com.rainbow.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @Author: 赖富城
 * @CreateTime: 2024/6/7
 * @Description:
 */
data class PlaceResponse(val status: String, val places: List<Place>)
data class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)
data class Location(val lng: String, val lat: String)
