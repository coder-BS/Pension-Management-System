package com.cognizant.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDetail {

	private String bankName; // Bank Name of the Pensioner Eg. SBI, HDFC etc.
	private String accountNumber; // Account Number of the Pensioner
	private String bankType; // Bank Type of the pensioner Eg. Private Public

}
