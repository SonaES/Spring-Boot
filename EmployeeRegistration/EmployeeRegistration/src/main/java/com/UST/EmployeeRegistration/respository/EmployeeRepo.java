/**
 * 
 */
package com.UST.EmployeeRegistration.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UST.EmployeeRegistration.model.Employee;

/**
 * @author Administrator
 *
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}