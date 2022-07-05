package emp.service;


	

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;

import emp.entity.Emp;
import emp.reopository.EmpRepository;

	;


public class EmpService {
		@Autowired
		private EmpRepository  repository;
		
		public Emp saveEmployee(Emp employee) {
			return repository.save(employee);
			}
		
		public List<Emp> saveEmployees(List<Emp> employees){
			return repository.saveAll(employees);
		}
		
		public  List<Emp> getEmployees(){
			return repository.findAll();
		}
		
		public Emp getEmployeeById(int id) {
		 return	repository.findById(id).orElse(null);
		}

	}


