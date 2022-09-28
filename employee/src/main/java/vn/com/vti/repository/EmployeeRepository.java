package vn.com.vti.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.com.vti.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	Optional<Employee> findByEmpNo(Integer empNo);
}
