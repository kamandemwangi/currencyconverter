package com.kamandemwangi.Currency.Rates;

import com.kamandemwangi.Currency.Rates.data.remote_data_source.RateWrapperService;
import com.kamandemwangi.Currency.Rates.utils.Constant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@SpringBootApplication
@EnableScheduling
public class CurrencyRatesApplication {

	@Bean
	public GsonConverterFactory getGonBuilder() {
		return GsonConverterFactory
				.create();
	}

	@Bean
	public Retrofit getRetrofitBuilder() {
		return new Retrofit.Builder()
				.baseUrl(Constant.BASE_URL)
				.addConverterFactory(getGonBuilder())
				.build();
	}

	@Bean
	public RateWrapperService provideRateWrapperService() {
		return getRetrofitBuilder().create(RateWrapperService.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CurrencyRatesApplication.class, args);
	}

}
