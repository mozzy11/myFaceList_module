package org.openmrs.module.facelist.DAO;

import java.util.List;

import org.openmrs.module.facelist.Department;

/**
 * Database methods for {@link DepartmentService}.
 */
public interface DepartmentDAO {
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#getAllDepartments()
	 */
	List<Department> getAllDepartments();
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#getDepartment(java.lan g.Integer)
	 */
	Department getDepartment(Integer departmentId);
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#saveDepartment(org.ope
	 *      nmrs.module.department.Department)
	 */
	Department saveDepartment(Department department);
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#purgeDepartment(org.op
	 *      enmrs.module.department.Department)
	 */
	void purgeDepartment(Department department);
}
