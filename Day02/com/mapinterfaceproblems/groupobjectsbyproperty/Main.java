package com.mapinterfaceproblems.groupobjectsbyproperty;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

//Class to test EmployeeGrouping functionality.

public class Main {

	// Main method to execute the grouping of employees.

	public static void main(String[] args) {

		// Creating a list to store Employee objects
		List<Employee> employees = new ArrayList<>();

		// Adding Employee objects to the list
		employees.add(new Employee("Alice", "HR"));
		employees.add(new Employee("Bob", "IT"));
		employees.add(new Employee("Carol", "HR"));

		// Calling the groupByDepartment method to group employees
		HashMap<String, List<Employee>> groupedEmployees = EmployeeGrouping.groupByDepartment(employees);

		// Printing the grouped employees department-wise
		System.out.println(groupedEmployees);
	}
}

