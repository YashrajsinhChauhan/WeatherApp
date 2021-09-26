package com.example.weatherapp.models

import java.io.Serializable

data class Main(
    val temp: Double,
    val tempMin: Double,
    val tempMax: Double,
    val pressure: Int,
    val humidity: Int
) : Serializable