package emp.reopository;

import org.springframework.data.jpa.repository.JpaRepository;

import emp.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

}
