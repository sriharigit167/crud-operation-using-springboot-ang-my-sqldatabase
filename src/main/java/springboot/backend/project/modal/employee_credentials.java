package springboot.backend.project.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_credentials")
public class employee_credentials {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="id")
	   private long id;
	   @Column(name="role")
       private String role;
	   @Column(name="salary")
       private long salary;
	   @Column(name="current_workingproject")
       private String project_working;
       
 
}
