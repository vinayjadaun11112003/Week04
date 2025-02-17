package com.annotations.customannotation_04;

// Defining the class that uses the custom annotation
public class TaskManager {
	// Applying the @TaskInfo annotation to a method
	@TaskInfo(priority = "High", assignedTo = "Vinay Jadaun")
	public void completeTask() {
		System.out.println("Task completed");
	}
}

