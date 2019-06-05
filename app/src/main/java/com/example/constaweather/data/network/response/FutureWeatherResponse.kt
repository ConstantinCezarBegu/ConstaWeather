package com.example.constaweather.data.network.response

import com.example.constaweather.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName


data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)