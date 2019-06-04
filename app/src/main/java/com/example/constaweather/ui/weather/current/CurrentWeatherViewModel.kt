package com.example.constaweather.ui.weather.current

import androidx.lifecycle.ViewModel
import com.example.constaweather.data.provider.UnitProvider
import com.example.constaweather.data.repository.ForecastRepository
import com.example.constaweather.internal.UnitSystem
import com.example.constaweather.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }

    val weatherLocation by lazyDeferred{
        forecastRepository.getWeatherLocation()
    }
}
