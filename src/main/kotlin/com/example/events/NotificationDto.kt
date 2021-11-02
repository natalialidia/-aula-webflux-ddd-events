package com.example.events

import com.example.domain.Coordinate
import com.example.domain.LastCoordinate
import com.example.domain.Route

data class NotificationDto(
        val coordinate: Coordinate,
        val lastCoordinate: LastCoordinate
)