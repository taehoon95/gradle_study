package gradle_study.dao;

import java.util.List;

import gradle_study.dto.Department;

public interface DepartmentDao {
	List<Department> selectDeptByAll();
	Department selectDeptByNo(Department dept);
	int insertDepartment(Department dept);
	int updateDepartment(Department dept);
	int deleteDepartment(int deptNo);
}
