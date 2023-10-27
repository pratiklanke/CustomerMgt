package com.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static com.code.CustValidation;
import java.util.Scanner;
import com.code.*;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			List<Customer> CustList = new ArrayList<>();
			boolean exit = false;
			System.out.println("Please Enter Choice: "
					+ "\n1. Sign up (customer registration)\n2. Sign in (login)\n3. Change password\n4. Un subscribe customer\n5. Display all customers.\n0. Exit  ");
			do {
				choice = sc.nextInt();
				switch (choice) {
				case 1:// Sign up (customer registration)
					System.out.println(
							"Enter Customers Details :\n name,  lname,  email,  password,  registrationAmount,  date , plan");
							Customer cust = validateCustomer()
					break;
				case 2: // Sign in (login)
					// i/p : email n password

					break;
				case 3:// Change password
						// i/p : email n old password n new password

					break;
				case 4:// Un subscribe customer
						// i/p : customer email

					break;
				case 5:// Display all customers.

					break;
				case 6:
					exit = true;

					break;
				default:
					break;
				}
			} while (!exit);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
