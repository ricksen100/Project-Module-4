package com.cg.spring.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.spring.beans.Product;

@RestController
public class ProductFrontController {

	@RequestMapping("/products") //products/{id}
	public Product getProduct(@RequestParam String id)  //@PathVariable
	{
		RestTemplate rt=new RestTemplate();
		Product p=rt.getForObject("http://localhost:8085/getproducts?id="+id,Product.class);
		return p;
	}
}
