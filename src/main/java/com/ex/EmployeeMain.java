package com.ex;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class EmployeeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		 
		ConfigurableApplicationContext context=SpringApplication.run(EmployeeMain.class, args);
		com.ex.EmployeeService.EmployeeService es=context.getBean(com.ex.EmployeeService.EmployeeService.class);
		 com.ex.EmployeeClass.Employee x=new com.ex.EmployeeClass.Employee();
		 x.setId(174);
		 x.setEname("mahi");
		 x.setEsal(675);
		 es.saveEmployee(x);
	
	}
}