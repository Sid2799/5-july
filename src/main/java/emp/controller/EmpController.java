package emp.controller;


	


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;

import emp.entity.Emp;
import emp.service.EmpService;

	

	public class EmpController {

		@Autowired
		private EmpService service;
		
		@PostMapping("/addEmployee")
		public Emp addEmployee(@RequestBody Emp employee) {
			return service.saveEmployee(employee);
			}
		
		@PostMapping("/addEmployees")
		 public  List<Emp> addEmployees(@RequestBody List<Emp> employees) {
				return service.saveEmployees(employees);
				}
		
		@GetMapping("/Employees")
		public List<Emp> findAllEmployees(){
			return service.getEmployees();
			}
		@GetMapping("/Employee/{id}")
		public Emp findEmployeeById(@PathVariable int id){
			return service.getEmployeeById(id);
			}
	}




