package com.example.events

const val geofence = 0.2 // 200 meters

interface IEventsProcessor {

    suspend fun processCoordinate(notificationDto: NotificationDto)
}