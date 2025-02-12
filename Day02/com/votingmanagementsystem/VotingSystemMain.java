package com.votingmanagementsystem;

// Main class to test the Voting System.

public class VotingSystemMain {
	public static void main(String[] args) {
		// Creating an instance of VotingSystem to manage votes
		VotingSystem votingSystem = new VotingSystem();

		// Casting some votes
		votingSystem.castVote("Alice");
		votingSystem.castVote("Bob");
		votingSystem.castVote("Alice");
		votingSystem.castVote("Charlie");
		votingSystem.castVote("Alice");
		votingSystem.castVote("Bob");
		votingSystem.castVote("Charlie");

		// Displaying the votes in the order they were cast
		votingSystem.displayVotesInOrder();

		// Displaying the results sorted by the number of votes
		votingSystem.displayResultsSortedByVotes();

		// Displaying the total votes per candidate
		votingSystem.displayTotalVotes();
	}
}
