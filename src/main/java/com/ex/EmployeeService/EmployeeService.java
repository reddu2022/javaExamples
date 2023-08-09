package com.ex.EmployeeService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ex.EmployeeClass.Employee;
import com.ex.EmployeeRepository.EmployeeRepository;
@Service
public class EmployeeService {
	private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    //save the information
	public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
	 public Employee getEmployeeById(Long id) {
	        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
	        return optionalEmployee.orElse(null);
	    }

	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }
	    public Employee updateEmployee(Long id, Employee updatedEmployee) {
	        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
	        if (optionalEmployee.isPresent()) {
	            Employee existingEmployee = optionalEmployee.get();
	            existingEmployee.setEname(updatedEmployee.getEname());
	            existingEmployee.setEsal(updatedEmployee.getEsal());
	            return employeeRepository.save(existingEmployee);
	        }
	        return null;
	    }
	    public void deleteEmployee(Long id) {
	        employeeRepository.deleteById(id);
	    }

}
