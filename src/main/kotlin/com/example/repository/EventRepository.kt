package com.example.repository

import com.example.domain.Event
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EventRepository: ReactiveMongoRepository<Event, String>