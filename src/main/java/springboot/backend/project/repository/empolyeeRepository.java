package springboot.backend.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.backend.project.modal.employee;

public interface empolyeeRepository extends JpaRepository<employee,Long>  
{

}
