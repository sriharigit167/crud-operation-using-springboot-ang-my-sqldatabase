package springboot.backend.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import springboot.backend.project.exception.ResourceNotFoundException;
import springboot.backend.project.modal.employee_credentials;
import springboot.backend.project.repository.employee_cred;

import springboot.backend.project.service.employee_credentailsService;
@Service
public class employee_credServiceimpl implements employee_credentailsService {
    private employee_cred Employee_cred;
  
	public employee_credServiceimpl(employee_cred employee_cred) {
		super();
		this.Employee_cred = employee_cred;
	}


	@Override
	public employee_credentials insertemployee_cred(employee_credentials Employee_credentials) {
		return Employee_cred.save(Employee_credentials);
	}


	@Override
	public List<employee_credentials> getallemployee_cred() {
		
		return Employee_cred.findAll();
	}


	@Override
	public employee_credentials findemployeecredbyid(long id) {
		employee_credentials Employee_credentials=Employee_cred.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee_cred","id",id));
		return Employee_credentials;
	}


	@Override
	public void updateempolyee_cred_by_id(long id, employee_credentials Employee_credentials) {
		employee_credentials emp_cred=Employee_cred.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee_credebtials","id",id));
		emp_cred.setRole(Employee_credentials.getRole());
		emp_cred.setProject_working(Employee_credentials.getProject_working());
		emp_cred.setSalary(Employee_credentials.getSalary());
		Employee_cred.save(emp_cred);
		
	}


	@Override
	public void dropemployee_cred_by_id(long id) {
		employee_credentials emp_cred=Employee_cred.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee_credebtials","id",id));
		Employee_cred.delete(emp_cred);
		
	}


	

}
