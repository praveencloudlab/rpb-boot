package com.cts.ecart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cts.ecart.model.Product;


@Controller
@RequestMapping(value = "/products")
public class ProductMvcController {
	
	@GetMapping(value = "/s1")
	public String f1() {
		System.out.println("ProductMvcController :: f1 method");
		return "one";
	}
	
	@GetMapping(value = "/s2")
	@ResponseBody
	public String f2() {
		
		return "Welcome to ecart application";
	}
	
	@GetMapping(value = "/s3")
	public String f3(Model model) {
		// model data
		String userName="Praveen";
		model.addAttribute("user", userName);//adds to request scope
		model.addAttribute("city","London");
		return "one";
	}
	
	
	@GetMapping(value = "/s4")
	public ModelAndView f4() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("user", "James");
		mav.addObject("city", "Chennai");
		
		mav.setViewName("one");
		
		return mav;
	}
	
	@GetMapping(value = "/s5")
	public String f5(ModelMap map) {
		map.put("user", "Richards");
		map.put("city", "Pune");
		return "one";
	}
	
	// v1 http://localhost:8080/products/s6/message_tobe_sent
	@GetMapping(value = "/s6/{msg}")
	public void f6(@PathVariable("msg") String message) {
		System.out.println(">>>>>> messsage: "+message);
	}
	
	//http://localhost:8080/products/s7?msg=message_value
	@GetMapping(value = "/s7")
	public void f7(@RequestParam("msg")String message) {
		System.out.println(">>>>> <<<< Message:: "+message);
	}
	
	// load form mapping
	@GetMapping("/loadForm")
	public String loadProductForm() {
		return "form";
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@RequestParam int productId,@RequestParam String productName,@RequestParam double price) {
		System.out.println(">> product id::: "+productId);
		System.out.println("product name:: "+productName);
		System.out.println("price:: "+price);
		return "form";
	}
	
	@PostMapping(value = "/saveProductv1")
	public String saveProductV1(@ModelAttribute Product prod ) {
		System.out.println(prod);
		return "form";
	}
	
	
	
	
	
	

}
