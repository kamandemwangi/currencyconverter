package com.kamandemwangi.Currency.Rates.data.remote_data_source

import com.kamandemwangi.Currency.Rates.model.RateWrapperEntity
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface RateWrapperService {
    @GET("latest")
    suspend fun getRates(@Header("apikey") apiKey: String, @Query("base") baseCurrency: String): RateWrapperEntity
}
