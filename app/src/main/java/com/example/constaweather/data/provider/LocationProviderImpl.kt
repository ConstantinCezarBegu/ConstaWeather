package com.example.constaweather.data.provider

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import androidx.core.content.ContextCompat
import com.example.constaweather.data.db.entity.WeatherLocation
import com.example.constaweather.internal.LocationPermissionNotGrantedException
import com.google.android.gms.location.FusedLocationProviderClient
import kotlinx.coroutines.Deferred

class LocationProviderImpl: LocationProvider{
    override suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation): Boolean {
        return true
    }

    override suspend fun getPreferredLocationString(): String {
        return "Los Angeles"
    }

}