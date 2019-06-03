package com.example.constaweather.data.provider

import com.example.constaweather.internal.UnitSystem


interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}