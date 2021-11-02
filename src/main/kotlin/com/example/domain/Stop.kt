package com.example.domain

import java.util.*

data class Stop(
        val id: Int,
        val address: String,
        val latitude: Double,
        val longitude: Double,
        var arrivalAt: Date? = null,
        var departureAt: Date? = null,
)