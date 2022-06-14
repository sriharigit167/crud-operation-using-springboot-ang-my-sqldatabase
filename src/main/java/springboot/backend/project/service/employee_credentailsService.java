package springboot.backend.project.service;

import java.util.List;

import springboot.backend.project.modal.employee_credentials;

public interface employee_credentailsService {
       employee_credentials insertemployee_cred(employee_credentials Employee_credentials);
       List<employee_credentials> getallemployee_cred();
       employee_credentials findemployeecredbyid(long id);
       void updateempolyee_cred_by_id(long id,employee_credentials Employee_credentials);
       void dropemployee_cred_by_id(long id);
       
       
}
