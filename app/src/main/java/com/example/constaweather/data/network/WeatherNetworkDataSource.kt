package com.example.constaweather.data.network

import androidx.lifecycle.LiveData
import com.example.constaweather.data.network.response.CurrentWeatherResponse


interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>


    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )
}