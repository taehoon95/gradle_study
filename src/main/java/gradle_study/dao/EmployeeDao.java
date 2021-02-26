package gradle_study.dao;

import java.util.List;

import gradle_study.dto.Department;
import gradle_study.dto.Employee;

public interface EmployeeDao {
	List<Employee> selectEmpByAll();
	List<Employee> selectEmpByAllJoin();
	
	List<Employee> selectEmpByDeptNo(Department dept);
	Employee selectEmpByNo(Employee employee);
	int insertEmployee(Employee employee);
	int updateEmployee(Employee employee);
	int deleteEmployee(int empNo);
}
