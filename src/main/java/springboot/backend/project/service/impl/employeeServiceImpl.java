package springboot.backend.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import springboot.backend.project.exception.ResourceNotFoundException;
import springboot.backend.project.modal.employee;
import springboot.backend.project.repository.empolyeeRepository;
import springboot.backend.project.service.EmployeeService;

@Service
public class employeeServiceImpl implements EmployeeService {
    private empolyeeRepository EmployeeRepository;
    
	public employeeServiceImpl(empolyeeRepository EmployeeRepository) {
		super();
		this.EmployeeRepository = EmployeeRepository;
	}

	@Override
	public employee saveEmployee(employee Employee) {
		// TODO Auto-generated method stub
		return EmployeeRepository.save(Employee);
	}

	@Override
	public List<employee> getallEmployee() {
		// TODO Auto-generated method stub
		return EmployeeRepository.findAll();
	}

	@Override
	public employee getemployeebyid(long Id) {
		java.util.Optional<employee> Emp = EmployeeRepository.findById(Id);
		if(Emp.isPresent())
		{
			return Emp.get();
		}
		else
		{
			throw new ResourceNotFoundException("employee","id",Id);
		}
	}

	@Override
	public employee updateemployee(long id, employee Emp_update) {
		employee Employee= EmployeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("employee","id",id));
		Employee.setFirst_name(Emp_update.getFirst_name());
		Employee.setLast_name(Emp_update.getLast_name());
		Employee.setEmail(Emp_update.getEmail());
		return EmployeeRepository.save(Employee);
	}

	@Override
	public employee deleteemployee(long id) {
		employee Employee =EmployeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("employee","id",id));
		EmployeeRepository.deleteById(id);
		return Employee;
}
  
}

	

