package com.pagian.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pagian.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
