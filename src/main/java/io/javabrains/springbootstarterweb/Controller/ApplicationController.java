package io.javabrains.springbootstarterweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	
	@RequestMapping("/Welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/operator")
	public String operator() {
		return "operator";
	}
	
	@RequestMapping("/dashboard")
	public String manager() {
		return "dashboard";
	}
	
	@RequestMapping("stock_report")
	public String stock_report() {
		return "stock_report";
	}
	
	@RequestMapping("van_report")
	public String van_report() {
		return "van_report";
	}
	
	@RequestMapping("shop_report")
	public String shop_report() {
		return "shop_report";
	}
	
	
}
