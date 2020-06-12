package com.sears.SpringBootLearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sears.SpringBootLearn.pojo.Product;
import com.sears.SpringBootLearn.productService.ProductService;

@Controller
public class AppController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = productService.listAll();
		model.addAttribute("listProducts", listProducts);
		return "index.html";
	}
	
	@RequestMapping("/new")
	public String showNewProductForm(Model model) {
		Product product=new Product();
		model.addAttribute("product", product);
		return "newProduct";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.save(product);
		return "redirect:/";
	}
}
