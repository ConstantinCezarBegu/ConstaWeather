package com.example.constaweather.data.network.response

import com.example.constaweather.data.db.entity.CurrentWeatherEntry
import com.example.constaweather.data.db.entity.Location
import com.google.gson.annotations.SerializedName

/*
    How to create a response use the json to kotlin extension.
    1) Give the class name
    2) paste the json that needs a data class
    3) advanced settings
    4) set the keyword to val
    5) type to non-nullable
    6) Annotation: Gson
    6) create annotation only when needed
    7) rename the data values like CurrentWeatherEntry (annotation needed)
    8) you can remove entries that are not needed
 */

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: Location
)