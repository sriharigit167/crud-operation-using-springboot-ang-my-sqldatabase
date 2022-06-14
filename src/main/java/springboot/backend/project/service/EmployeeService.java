package springboot.backend.project.service;

import java.util.List;

import springboot.backend.project.modal.employee;

public interface EmployeeService {
	employee saveEmployee(employee Employee);
	List<employee> getallEmployee();
	employee getemployeebyid(long Id);
	employee updateemployee(long id,employee Employee);
	employee deleteemployee(long id);
}
