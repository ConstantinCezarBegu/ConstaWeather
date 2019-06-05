package com.example.constaweather.ui.weather.future.list

import androidx.lifecycle.ViewModel
import com.example.constaweather.data.provider.UnitProvider
import com.example.constaweather.data.repository.ForecastRepository
import com.example.constaweather.internal.lazyDeferred
import com.example.constaweather.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
