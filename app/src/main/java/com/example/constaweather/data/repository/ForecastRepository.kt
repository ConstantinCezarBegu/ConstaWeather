package com.example.constaweather.data.repository

import androidx.lifecycle.LiveData
import com.example.constaweather.data.db.unitlocolized.UnitSpecificCurrentWeatherEntry

import org.threeten.bp.LocalDate


interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>

}