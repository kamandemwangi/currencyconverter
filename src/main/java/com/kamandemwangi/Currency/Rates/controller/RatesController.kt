package com.kamandemwangi.Currency.Rates.controller;


import com.kamandemwangi.Currency.Rates.model.RateWrapperEntity
import com.kamandemwangi.Currency.Rates.repositories.RatesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RatesController(private val repository: RatesRepository) {

    @GetMapping("/rates")
    private suspend fun all(): List<RateWrapperEntity> = withContext(Dispatchers.IO) {
            repository.findAll()
        }
}

