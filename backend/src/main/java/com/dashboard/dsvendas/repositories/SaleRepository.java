package com.dashboard.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dashboard.dsvendas.DTO.SaleSucessDTO;
import com.dashboard.dsvendas.DTO.SaleSumDTO;
import com.dashboard.dsvendas.entities.Sale;
//Responsavel por acessar os dados do Sale
public interface SaleRepository  extends JpaRepository<Sale, Long>{

	@Query("SELECT new com.dashboard.dsvendas.DTO.SaleSumDTO(obj.seller, SUM(obj.amount)) " 
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupdBySeller();
	
	@Query("SELECT new com.dashboard.dsvendas.DTO.SaleSucessDTO(obj.seller, SUM(obj.visited),SUM(obj.deals)) " 
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSucessDTO> sucessGroupdBySeller();

}
