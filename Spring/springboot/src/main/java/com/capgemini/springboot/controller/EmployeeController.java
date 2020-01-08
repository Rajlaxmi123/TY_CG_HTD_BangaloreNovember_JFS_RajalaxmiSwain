package com.capgemini.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboot.dto.EmployeeBean;
import com.capgemini.springboot.dto.EmployeeResponse;
import com.capgemini.springboot.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
//	@PostMapping(path="/auth",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
//	//consumes used only if its accepting the object and it is having a request body
//	public EmployeeBean auth(@RequestBody EmployeeBean bean)
//	{
//		return service.auth(bean.getEmail(),bean.getPassword());
//	}
	
	
	@PostMapping(path="/auth",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	//consumes used only if its accepting the object and it is having a request body
	public EmployeeResponse auth(@RequestBody EmployeeBean bean)
	{     EmployeeResponse response = new EmployeeResponse();
		EmployeeBean employeeBean = service.auth(bean.getEmail(), bean.getPassword());
		if(employeeBean !=null)
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("employee found for credentials");
			response.setBeans(Arrays.asList(employeeBean));
		}else
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("credentials invalid");
		}
		return response;
	}
	
//	@PostMapping(path="/register",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
//	public boolean register(@RequestBody EmployeeBean bean)
//	{
//		return service.register(bean);
//	}
	
	
	
	@PostMapping(path="/register",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse register(@RequestBody EmployeeBean bean)
	{    EmployeeResponse response = new EmployeeResponse();
		if( service.register(bean))
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("employee registered");
			
		}else
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("email already exists");
		}
		return response;
		
	}
	
	
	
//	@GetMapping(path="/get",produces=MediaType.APPLICATION_JSON_VALUE)
//	public List<EmployeeBean> searchEmployee(@RequestParam("key") String key ){
//		return service.getEmployees(key);
//	}
	
	@GetMapping(path="/get",produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse  searchEmployee(@RequestParam("key") String key ){
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> employeeBean = service.getEmployees(key);
		if(employeeBean .isEmpty())
		{

			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("credentials invalid");
			
		}else
		{response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("employee found for credentials");
		response.setBeans(employeeBean);
		}
		return response;
		
		
	}
	
	
	
	
	@PutMapping(path="/change-password",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse changePassword(@RequestBody EmployeeBean bean)
	{EmployeeResponse response = new EmployeeResponse();
	if(service.changePassword(bean.getId(), bean.getPassword()))
			{
			response.setStatusCode(201);
	response.setMessage("Success");
	response.setDescription("password changed");
	
}else
{
	response.setStatusCode(401);
	response.setMessage("Failure");
	response.setDescription("password not changed");
}
return response;

}
	
	@DeleteMapping(path="/delete/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id)
	{
		EmployeeResponse response = new EmployeeResponse();
		
		service.deleteEmployee(id);
		
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Details Deleted");
		
		
		return response;
	}
	
	
	
	
	
	
	
	
	
	
}
