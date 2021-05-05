package com.dashboard.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.dsvendas.DTO.SaleDTO;
import com.dashboard.dsvendas.DTO.SaleSucessDTO;
import com.dashboard.dsvendas.DTO.SaleSumDTO;
import com.dashboard.dsvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupdBySeller(){
		List<SaleSumDTO> list = service.amountGroupdBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/sucess-by-seller")
	public ResponseEntity<List<SaleSucessDTO>> sucessGroupdBySeller(){
		List<SaleSucessDTO> list = service.sucessGroupdBySeller();
		return ResponseEntity.ok(list);
	}
	
}
