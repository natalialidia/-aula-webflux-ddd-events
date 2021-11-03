package com.example.repository

import com.example.domain.Route
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RouteRepository: CoroutineCrudRepository<Route, Int> {

    suspend fun getRouteByEquipment_Id(id: Int): Route?

}