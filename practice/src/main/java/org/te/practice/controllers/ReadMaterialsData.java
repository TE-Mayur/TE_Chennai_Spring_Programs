package org.te.practice.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.te.practice.beans.MaterialDetails;


@Controller
public class ReadMaterialsData {

	// display materials page

	@GetMapping("/details")
	public String displayMaterialpage() {
		return "material";
	}

	// First way of reading the form data
	@PostMapping("/details1")
	public ModelAndView getMaterialOne(HttpServletRequest req, ModelAndView modelAndView) {

		Integer quantity = Integer.parseInt(req.getParameter("quantity"));
		String product = req.getParameter("product");
		Double price = Double.parseDouble(req.getParameter("price"));
		String brand = req.getParameter("brand");
		String type = req.getParameter("type");
		Double gst = Double.parseDouble(req.getParameter("gst"));
		String quality = req.getParameter("quality");
		modelAndView.addObject("quantity", quantity);
		modelAndView.addObject("product", product);
		modelAndView.addObject("price", price);
		modelAndView.addObject("brand", brand);
		modelAndView.addObject("type", type);
		modelAndView.addObject("gst", gst);
		modelAndView.addObject("quality", quality);
		modelAndView.setViewName("materialdetails");
		return modelAndView;
		// getdataOne
	}

	// 1st way of reading the form data

	@PostMapping("/details2")
	public String getMaterialTwo(@RequestParam(name = "") Integer quantity, @RequestParam(name = "") String product,
			@RequestParam(name = "") Double price, @RequestParam(name = "") String brand,
			@RequestParam(name = "") String type, @RequestParam(name = "") Double gst,
			@RequestParam(name = "") String quality, ModelMap map) {
		map.addAttribute("quantity", quantity);
		map.addAttribute("product", product);
		map.addAttribute("price", price);
		map.addAttribute("brand", brand);
		map.addAttribute("type", type);
		map.addAttribute("gst", gst);
		map.addAttribute("quality", quality);
		return "materialdetails";

	}

	@PostMapping("/details3")
	public String getMaterialThree(Integer quantity, String product, Double price, String brand, String type,
			Double gst, String quality, ModelMap map) {
		map.addAttribute("quantity", quantity);
		map.addAttribute("product", product);
		map.addAttribute("price", price);
		map.addAttribute("brand", brand);
		map.addAttribute("type", type);
		map.addAttribute("gst", gst);
		map.addAttribute("quality", quality);
		return "materialdetails";

	}
	
	@PostMapping("/details4")
	public String getDataFour(MaterialDetails details , ModelMap modelMap) {
		modelMap.addAttribute("Material", details);
		return "materialdetails";
		
	}
}