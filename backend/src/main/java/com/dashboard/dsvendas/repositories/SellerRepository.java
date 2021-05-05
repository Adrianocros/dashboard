package com.dashboard.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboard.dsvendas.entities.Seller;
//Responsavel por acessar os dados do Seller
public interface SellerRepository  extends JpaRepository<Seller, Long>{

}
