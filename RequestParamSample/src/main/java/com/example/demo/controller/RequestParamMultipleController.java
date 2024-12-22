package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.SampleForm;

@Controller
public class RequestParamMultipleController {
	
	// GET かつ [url:/multiple]
	@GetMapping("multiple")
	public String showView() {
		// 戻り値は「ビュー名」を返す
		return "entry";
	}
	
	// POSTかつ [url:/confirm]
//	@PostMapping("confirm")
//	public String confirmView(Model model, @RequestParam String name, @RequestParam Integer age, 
//			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam LocalDate birth) {
//		
//		// Modelに格納する
//		model.addAttribute("name", name);
//		model.addAttribute("age", age);
//		model.addAttribute("birth", birth);
//		
//		// 戻り値は「ビュー名」を返す
//		return "confirm";
//	}
	
	// POSTかつ [url:/confirm]
	@PostMapping("confirm")
	public String confirmView(SampleForm f) {
		// 戻り値は「ビュー名」を返す
		return "confirm2";
	}
}
