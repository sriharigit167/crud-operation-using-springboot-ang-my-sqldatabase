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

import springboot.backend.project.modal.employee_credentials;
import springboot.backend.project.service.employee_credentailsService;
@RequestMapping("/employee/cred")
@RestController
public class employeecredController {
	private employee_credentailsService Employee_credentailsService;
	
	 public employeecredController(employee_credentailsService employee_credentailsService) {
		super();
		this.Employee_credentailsService = employee_credentailsService;
	}

	@PostMapping("/create")
	 public ResponseEntity<employee_credentials> saveEmployee_cred(@RequestBody employee_credentials Employee_credential)
	 {
		 return new ResponseEntity<employee_credentials>(Employee_credentailsService.insertemployee_cred(Employee_credential),HttpStatus.OK);
	 }
	 //rest api to fetch all employee credentials from database
	 @GetMapping("/fetchall")
     public List<employee_credentials> getallEmployeecred()
     {
    	 return Employee_credentailsService.getallemployee_cred();
     }
   //fetching employee credentials by id
     @GetMapping("{id}")
     public ResponseEntity<employee_credentials> getempcredbyid(@PathVariable long id)
     {
    	 return new ResponseEntity<employee_credentials>(Employee_credentailsService.findemployeecredbyid(id),HttpStatus.OK);
    	 
     }
     //update employee credentials with specfic employee id
     @PutMapping("{id}")
     public void update_emp_id(@PathVariable("id") long id,@RequestBody employee_credentials Employee_credential)
     {
    	 Employee_credentailsService.updateempolyee_cred_by_id(id,Employee_credential);
     }
     @DeleteMapping("{id}")
     public void deleteemp_cred_by_id(@PathVariable("id") long id)
     {
    	 Employee_credentailsService.dropemployee_cred_by_id(id);
     }

}
