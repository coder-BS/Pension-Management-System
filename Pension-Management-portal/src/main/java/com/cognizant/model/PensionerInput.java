package com.cognizant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PensionerInput {

	private String name;
	private String dateOfBirth;
	private String panNumber;
	private String aadhaarNumber;
	private String pensionType;

}