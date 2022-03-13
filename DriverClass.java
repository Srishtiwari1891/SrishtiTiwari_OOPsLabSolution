package com.greatlearning.EmailApp.driver;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.greatlearning.EmailApp.main.Employee;
import com.greatlearning.EmailApp.service.CredentialService;

public class DriverClass {

		public static void main(String[] args) {
			int dChoice;
			Scanner sc= new Scanner(System.in);
			String fname,lname;
			boolean flag=false;
			CredentialService objCred= new CredentialService();
			Employee objEmp = null;
			while(!flag) {
				System.out.println("Please enter department from the following : "
						+ "\n1. Technical"
						+ "\n2. Admin"
						+ "\n3. Human Resource"
						+ "\n4. Legal");
				try {
					dChoice=sc.nextInt();
					switch(dChoice) {
					case 1:
							flag=true;
							System.out.println("\nEnter First Name:");
							fname=sc.next();
							System.out.println("\nEnter Last Name:");
							lname=sc.next();
							objEmp= new Employee(fname, lname);
							objCred.generateEmailAddress(objEmp, "tech");
							break;
					
					case 2:
							flag=true;
							System.out.println("\nEnter First Name:");
							fname=sc.next();
							System.out.println("\nEnter Last Name:");
							lname=sc.next();
							objEmp= new Employee(fname, lname);
							objCred.generateEmailAddress(objEmp, "adm");
							break;
							
					case 3:
							flag=true;
							System.out.println("\nEnter First Name:");
							fname=sc.next();
							System.out.println("\nEnter Last Name:");
							lname=sc.next();
							objEmp= new Employee(fname, lname);
							objCred.generateEmailAddress(objEmp, "hr");
							break;
							
					case 4: 
							flag=true;
							System.out.println("\nEnter First Name:");
							fname=sc.next();
							System.out.println("\nEnter Last Name:");
							lname=sc.next();
							objEmp= new Employee(fname, lname);
							objCred.generateEmailAddress(objEmp, "lg");
							break;
							
					default:
							System.out.println("Invalid input.. Please select correct option\n");
							return;
					}
				}
				catch(InputMismatchException e){
					flag=true;
					System.out.println("Not valid input");
					return;
				}
				finally {
					sc.close();
				}
			}
			objCred.showCredentials(objEmp);
		}
}