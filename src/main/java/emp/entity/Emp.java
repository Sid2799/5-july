package emp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name= "Empl")

public class Emp {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int salary;
}
