package springboot.backend.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.backend.project.modal.employee;
import springboot.backend.project.service.EmployeeService;

@RestController
@RequestMapping("/Employees/create")
public class EmployeeeController {
	
	private EmployeeService employeeService;

	public EmployeeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	//bulid create employee REST API
	@PostMapping()
    public  ResponseEntity<employee> saveEmployee(@RequestBody employee Employee)// to convert jason object into java object we use RequestMapping annotation
    {
    	return new ResponseEntity<employee>(employeeService.saveEmployee(Employee),HttpStatus.CREATED);
    }
    // bulid get all employees REST API
    @GetMapping
    public List<employee> getallempolyees()
    {
		return employeeService.getallEmployee();
    }
    //bulid get employee by Id REST API
    @GetMapping("{id}")
    
    public ResponseEntity<employee> getEmployeebyid(@PathVariable("id") long id)
    {
    	return new ResponseEntity<employee>(employeeService.getemployeebyid(id),HttpStatus.OK);
    }
    // bulid to update the employee_details REST API 
    @PutMapping("{id}")
    public ResponseEntity<employee> updateEmployee(@PathVariable("id") long id, @RequestBody() employee Employee)
    {
    	return new ResponseEntity<employee>(employeeService.updateemployee(id,Employee),HttpStatus.OK);
    }
    //bulid delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<employee> deleteemployee(@PathVariable("id") long id)
    {
    	return new ResponseEntity<employee>(employeeService.deleteemployee(id),HttpStatus.OK);
    }
}