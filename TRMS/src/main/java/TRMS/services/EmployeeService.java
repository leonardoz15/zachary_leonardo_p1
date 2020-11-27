/**
 * 
 */
package TRMS.services;

import java.util.List;

import TRMS.models.Employee;

/**
 * @author Zachary Leonardo
 *
 */
public interface EmployeeService {
	
	public Employee createEmployee(Employee employee);
	
	public Employee readEmployee(int EmployeeId);
	
	public List<Employee> readAllEmployees();
	
	public Employee updateEmployee(int employeeId, Employee employee);
	
	public void deleteEmployee(Employee employee);
	
}
