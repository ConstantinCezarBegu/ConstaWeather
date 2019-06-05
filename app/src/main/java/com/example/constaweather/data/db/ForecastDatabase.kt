package com.example.constaweather.data.db

import android.content.Context
import androidx.room.*
import com.example.constaweather.data.db.entity.CurrentWeatherEntry
import com.example.constaweather.data.db.entity.WeatherLocation


@Database(
    entities = [CurrentWeatherEntry::class, WeatherLocation::class],
    version = 1
)
@TypeConverters(LocalDateConverter::class)
abstract class ForecastDatabase : RoomDatabase() {
    abstract fun currentWeatherDao(): CurrentWeatherDao
    abstract fun futureWeatherDao(): FutureWeatherDao
    abstract fun weatherLocationDao(): WeatherLocationDao


    companion object {
        @Volatile private var instance: ForecastDatabase? = null
        private val LOCK = Any()

        // ?: if not initialized then it is going to initialize it
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context) =
                Room.databaseBuilder(context.applicationContext,
                    ForecastDatabase::class.java, "forecast.db")
                    .build()
    }
}