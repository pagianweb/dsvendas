package com.pagian.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pagian.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
