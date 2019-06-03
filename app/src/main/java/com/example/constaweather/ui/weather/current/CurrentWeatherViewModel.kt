package com.example.constaweather.ui.weather.current

import androidx.lifecycle.ViewModel
import com.example.constaweather.data.repository.ForecastRepository
import com.example.constaweather.internal.UnitSystem
import com.example.constaweather.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository
) : ViewModel() {
    private val unitSystem = UnitSystem.METRIC

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }

}
