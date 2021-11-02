package com.example.repository

import com.example.domain.Route
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface RouteRepository: ReactiveMongoRepository<Route, Int> {

    fun getRouteByEquipment_Id(id: Int): Mono<Route>

}