package com.kamandemwangi.Currency.Rates.data;

import com.kamandemwangi.Currency.Rates.data.remote_data_source.RateWrapperService
import com.kamandemwangi.Currency.Rates.repositories.RatesRepository
import com.kamandemwangi.Currency.Rates.utils.Constant
import com.kamandemwangi.Currency.Rates.utils.LoggingTimestamp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.Scheduled


@Configuration
open class LoadDatabase(
    private val ratesRepository: RatesRepository,
    private val service: RateWrapperService
) {

    private val log = LoggerFactory.getLogger(LoadDatabase::class.java)

    @Bean
    open fun initDatabase() =
        CommandLineRunner {
            fetchCurrenciesRates()
        }

    @Scheduled(cron = "0 0 */3 * * *")
    private fun fetchCurrenciesRates() {
        runBlocking {
            withContext(Dispatchers.IO) {
                try {
                    val rateWrapperEntity = service.getRates(apiKey = System.getenv("API_KEY"), baseCurrency = Constant.BASE_CURRENCY)
                    log.info("[${LoggingTimestamp.timestamp()}] [INFO] Currencies rates: $rateWrapperEntity")
                    ratesRepository.deleteAll()
                    ratesRepository.save(rateWrapperEntity)
                } catch (e: Exception) {
                    log.info("[${LoggingTimestamp.timestamp()}] [ERROR] Message: ${e.message} Cause: ${e.cause}")
                }

            }

        }
    }
}
