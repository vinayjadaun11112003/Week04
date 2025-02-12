package com.mapinterfaceproblems.groupobjectsbyproperty;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

//Class to group employees by their department.

public class EmployeeGrouping {

	//Method to group employees by department using a HashMap.

	public static HashMap<String, List<Employee>> groupByDepartment(List<Employee> employees) {

		// Creating a HashMap to store department-wise employee lists
		HashMap<String, List<Employee>> departmentMap = new HashMap<>();

		// Iterating through each employee in the given list
		for (Employee emp : employees) {

			// Extracting the department name from the current employee
			String dept = emp.getDepartment();

			// Checking if the department is already present in the map
			if (!departmentMap.containsKey(dept)) {

				// If not present, create a new list for this department
				departmentMap.put(dept, new ArrayList<>());
			}

			// Adding the current employee to the respective department list
			departmentMap.get(dept).add(emp);
		}

		// Returning the map containing employees grouped by department
		return departmentMap;
	}
}
