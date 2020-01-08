package com.capgemini.springmvc.controller;


import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.capgemini.springmvc.beans.User;

@Controller
public class SpringController {
	@Autowired
	private ServletContext context;

	@RequestMapping("/hello")
	public String hello(ModelMap map)
	{
		map.addAttribute("msg", "Hello world..........");
		return "index";//returning name of jsp file
	}
	
	//@RequestMapping(path= "/query", method=RequestMethod.GET)  //exactly like overriding doGet method
	@GetMapping("/query")   //requestmapping and getmapping are same.
	public String query( @RequestParam("name")String name,@RequestParam("age")int age,ModelMap map)
	{
		map.addAttribute("name",name);
		map.addAttribute("age", age);
		return "query";
	}
	
	@GetMapping("/form")
	public String form() {
		return "form";
	}
	
//	@PostMapping("/form")   //u cant have two post or two get,if u want to have same mapping then u have to give different URL
//	public String form(String name, String email, String password, String gender,ModelMap map)
//	{
//		map.addAttribute("name", name);
//		map.addAttribute("email", email);
//		map.addAttribute("password", password);
//		map.addAttribute("gender", gender);
//		return "form";
//	}add
	
	
	@PostMapping("/form")   //u cant have two post or two get,if u want to have same mapping then u have to give different URL
	public String form(User user,ModelMap map)
{	map.addAttribute("name", user.getName());                 //spring is setting the data and we are getting it through getters method
	map.addAttribute("email", user.getEmail());
	map.addAttribute("password", user.getPassword());
	map.addAttribute("gender", user.getGender());
	return "form";
	}
	
	@GetMapping("/createcookie")
	public String createCookie(HttpServletResponse response)
	{
		Cookie cookie = new Cookie("name","Rajlaxmi");
		response.addCookie(cookie);
		
		return"createcookie";
	}
	
	@GetMapping("/getcookie")
	public String getCookie(@CookieValue(name ="name" ,required = false)String name,ModelMap map)
	{
		if(name !=null)
		map.addAttribute("name",name);
		else
			map.addAttribute("name","Rajlaxmi");
		return "getcookie";
	}
	
	@GetMapping(("/path/{movie}/{hero}"))
	public String path(@PathVariable("movie")String movie,@PathVariable("hero")String hero,ModelMap map) //string doesnt know u are passing the path value,
	//so u to annotate it
	{ map.addAttribute("movie",movie);  //you have to pass it to front end
	map.addAttribute("hero", hero);
		return "pathvalue";
	}
	
	@GetMapping("/forward")
	public String forward()
	{
		return "forward:hello"; //hello is the controller name not jsp name.
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:https://www.google.com";
		
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@PostMapping("/login")
	public String login(String username,String password,HttpServletRequest request,ModelMap map)
	{ 
		if(username.equals("user") && password.equals("qwerty"))
		{ User user = new User();
		user.setName(username);
		user.setEmail("raj@gmail.com");
		user.setGender("O");
		user.setPassword(password);
		
		HttpSession session = request.getSession();     
		session.setAttribute("user", user);     ///setting the session attribute
		
		
			request.getSession();
		map.addAttribute("msg","user Logged in");
		return "home";
	}else {
	
		map.addAttribute("msg","credentials invalid");
		return "login";
	}
	}
	
//	@PostMapping("/login")
//	public String login(String username,String password,HttpSession session,ModelMap map)
//	{ 
//		if(username.equals("user") && password.equals("qwerty"))
//		{    
//		map.addAttribute("msg","user Loged in");
//		return "home";
//	}else {
//		session.invalidate();
//		map.addAttribute("msg","credentials invalid");
//		return "login";
//	}
//	}
	
	
	//validating session
	@GetMapping("/home")
	public String home(@SessionAttribute(name= "user",required=false)User user)
	{if(user!=null) {
		return "home";
	}else
	{
		return "login";
	}
	}
	
	
	@Autowired
	@GetMapping("setappattribute")
	public String setAppAttribute()
	{
		context.setAttribute("msg", new Object());
		return "setcontext";
	}
	
	@GetMapping("getappattribute")
	public String getAppAttribute()
	{
		System.out.println(context.getAttribute("msg"));
		return "getcontext";
	}

	
}
