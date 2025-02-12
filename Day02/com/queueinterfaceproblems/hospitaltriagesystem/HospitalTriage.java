package com.queueinterfaceproblems.hospitaltriagesystem;

import java.util.*;
// Class to simulate a hospital triage system using a priority queue.

public class HospitalTriage {
//Processes patients based on their severity level using a priority queue.

	public static List<String> processPatients(List<Patient> patients) {
		// Create a priority queue to sort patients by severity (higher first)
		PriorityQueue<Patient> queue = new PriorityQueue<>(Collections.reverseOrder());

		// Add all patients to the priority queue
		queue.addAll(patients);

		// Create a list to store the order of treated patients
		List<String> treatmentOrder = new ArrayList<>();

		// Process patients based on severity
		while (!queue.isEmpty()) {
			treatmentOrder.add(queue.poll().name);
		}

		// Return the order of treated patients
		return treatmentOrder;
	}
}
