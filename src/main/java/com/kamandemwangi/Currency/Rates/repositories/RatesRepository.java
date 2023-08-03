package com.kamandemwangi.Currency.Rates.repositories;

import com.kamandemwangi.Currency.Rates.model.RateWrapperEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatesRepository extends JpaRepository<RateWrapperEntity, Long> {
}
