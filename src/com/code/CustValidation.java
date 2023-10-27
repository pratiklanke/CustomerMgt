package com.code;

import java.time.LocalDate;

import com.custExc.InvalidInputExc;

public class CustValidation {
	public static ServicePlan validatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	public static void validateCharges(ServicePlan plan, double charges) throws InvalidInputExc {
		if (plan.getCharges() != charges) {
			throw new InvalidInputExc("Charges doesn't match with Plan ..!");
		}
	}

	public static LocalDate validateDate(String dt) {
		return LocalDate.parse(dt);
	}

	public static Customer validateCustomer(String name, String lname, String email, String password,
			double registrationAmount, String date, String plan) throws InvalidInputExc {
		ServicePlan sp = validatePlan(plan);
		validateCharges(sp, registrationAmount);
		LocalDate dt = validateDate(date);
		return new Customer(name, lname, email, password, registrationAmount, dt, sp);

	}
}
