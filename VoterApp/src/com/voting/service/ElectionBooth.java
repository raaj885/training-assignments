package com.voting.service;

import com.voting.exceptions.*;

public class ElectionBooth {
	String localities[] = { "ABC Nagar", "XYZ Nagar", "RK Nagar" };

	// if age is less than 18 throw exception
	public boolean checkAge(int age) throws UnderAgeException {
		if (age < 18) {
			throw new UnderAgeException("Not eligible to vote -Under aged");
		} else {
			return true;
		}
	}

	// check if the locality matches with the array
	public boolean checkLocality(String locality) throws LocalityNotFoundException {
		for (String localityCheck : localities) {
			if (locality.equalsIgnoreCase(localityCheck)) {
				return true;
			} else {
				throw new LocalityNotFoundException("Wrong Locality ");
			}
		}
		return false;
	}

	// check if id is within 1000 - 9000
	public boolean checkVoterId(int voterId) throws NoVoterIDException {

		if (voterId >= 1000 && voterId <= 9000) {
			return true;
		} else {
			throw new NoVoterIDException("Invalid Voter ID ");
		}
	}

	public boolean checkEligibility(int age, String locality, int voterId) throws NotEligibleException {
		// call all three methods
		// handle the exception
		// throw it to the voter
		if (checkAge(age) && checkLocality(locality) && checkVoterId(voterId)) {

			System.out.println("You are eligible to Vote");
		} else {
			throw new NotEligibleException("You are not Eligible to vote");
		}

		return true;
	}

}