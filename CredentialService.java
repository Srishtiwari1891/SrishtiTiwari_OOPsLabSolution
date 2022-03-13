package com.greatlearning.EmailApp.service;

import java.util.Random;

import com.greatlearning.EmailApp.main.Employee;

public class CredentialService {
	String deptName,email;
	char[] pwd;
	public void generatePassword(Employee e) {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$%^&*()_+/;";
	      String numbers = "1234567890";
	   String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] pwd = new char[8];
	      for(int i = 0; i<pwd.length ; i++) {
	         pwd[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      e.setPwd(pwd.toString());
	   }
	
	public void generateEmailAddress(Employee e, String deptName) {
		e.setEmail(e.Firstname+e.Lastname+"@"+deptName+".abc.com");
		generatePassword(e);
	}
	
	public void showCredentials(Employee e) {
		System.out.println("\nDear "+e.Firstname+" "+e.Lastname+", your generated credentials are as follows:"
				+ "\nEmail : "+e.getEmail()
				+"\nPassword : "+e.getPwd());
	}
}
