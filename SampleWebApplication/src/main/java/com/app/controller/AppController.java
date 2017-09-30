package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	
	@RequestMapping( "/")
	public String getHome(){
		
		System.out.println("entering home index 0");
		return "index";
	}
	
	@RequestMapping( "/index")
	public String getHomePage(){
		
		System.out.println("entering home index 1");
		return "index";
	}
	
	@RequestMapping("/carpentryinfo")
	public String getCarpentryInfo(){
		
		System.out.println("entering workshop");
		return "pages/carpentryinfo";
	}
	
	@RequestMapping("/plumbinginfo")
	public String getPlumbingInfo(){
		
		System.out.println("entering plumber");
		return "pages/plumbinginfo";
	}
	
	@RequestMapping("/electricinfo")
	public String getElectricInfo(){
		
		System.out.println("entering electric");
		return "pages/electricinfo";
	}
	
	@RequestMapping("/handyman")
	public String getHandyManPage(){
		
		System.out.println("entering electric");
		return "pages/handyman";
	}
	
	@RequestMapping("/projects")
	public String getProjectsPage(){
		
		System.out.println("entering electric");
		return "pages/projects";
	}
	
	@RequestMapping("/contactus")
	public String getContactUsPage(){
		
		System.out.println("entering electric");
		return "pages/contactus";
	}
	
}
