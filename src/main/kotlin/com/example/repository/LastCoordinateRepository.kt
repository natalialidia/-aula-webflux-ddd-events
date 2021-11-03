package com.example.repository

import com.example.domain.LastCoordinate
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LastCoordinateRepository: CoroutineCrudRepository<LastCoordinate, String> {
    suspend fun getLastCoordinateByEquipment_Id(id: Int): LastCoordinate?
}