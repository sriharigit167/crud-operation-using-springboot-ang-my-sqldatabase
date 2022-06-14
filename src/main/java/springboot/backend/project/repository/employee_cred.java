package springboot.backend.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.backend.project.modal.employee_credentials;

public interface employee_cred extends JpaRepository<employee_credentials,Long> {

}
