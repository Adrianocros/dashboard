package com.dashboard.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dashboard.dsvendas.DTO.SaleDTO;
import com.dashboard.dsvendas.entities.Sale;
import com.dashboard.dsvendas.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public Page<SaleDTO> findAll(Pageable pageable ){
		Page<Sale> result =  repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	

}
