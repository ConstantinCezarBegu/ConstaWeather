package com.example.constaweather.ui.base

import androidx.lifecycle.ViewModel
import com.example.constaweather.data.provider.UnitProvider
import com.example.constaweather.data.repository.ForecastRepository
import com.example.constaweather.internal.UnitSystem
import com.example.constaweather.internal.lazyDeferred

abstract class WeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}