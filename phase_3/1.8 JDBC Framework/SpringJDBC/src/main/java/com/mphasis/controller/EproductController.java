package com.mphasis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mphasis.dao.EproductDAO;
import com.mphasis.model.Eproduct;

@Controller
public class EproductController {

	@Autowired
	EproductDAO employeeDAO;
	
	@GetMapping("/listProducts")
	public String listProducts(Model model) {
		
		List<Eproduct> products = employeeDAO.getProducts();
		model.addAttribute("products", products);
		
		return "listProducts";
	}
	
	
}

