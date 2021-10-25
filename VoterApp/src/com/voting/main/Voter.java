package com.voting.main;


import java.io.IOException;
import java.util.Scanner;
import com.voting.service.ElectionBooth;
import com.voting.exceptions.LocalityNotFoundException;
import com.voting.exceptions.NoVoterIDException;
import com.voting.exceptions.NotEligibleException;
import com.voting.exceptions.UnderAgeException;

public class Voter {

	public static void main(String[] args) throws IOException {

		int voterAge=0, voterId =0;
		String locality;
		ElectionBooth booth  = new ElectionBooth();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Age of the Voter :");
		voterAge = Integer.parseInt(sc.nextLine());
		try {
			booth.checkAge(voterAge);
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
			System.exit(0);

		}
		System.out.println("Enter the  Locality of the Voter : ");
		locality = sc.nextLine();
		try {
			booth.checkLocality(locality);
		} catch (LocalityNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);

		}
		System.out.println("Enter the  VoterId of Voter :");
		voterId = Integer.parseInt(sc.nextLine());
		try {
			booth.checkVoterId(voterId);
		} catch (NoVoterIDException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		try {
			booth.checkEligibility(voterAge, locality, voterId);
		} catch (NotEligibleException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}



	}

}