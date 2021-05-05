package com.dashboard.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboard.dsvendas.entities.Sale;
//Responsavel por acessar os dados do Sale
public interface SaleRepository  extends JpaRepository<Sale, Long>{

}
