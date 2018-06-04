package com.softxide.store;

import com.softxide.store.enums.CustomerType;

public class Customer {

	private String customerName ;
	private int customerID;
	private CustomerType cType;
	
	public Customer(String name, int id , CustomerType ageType) {
		this.customerName = name;
		this.customerID = id;
		this.cType = ageType;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the ageType
	 */
	public CustomerType getAgeType() {
		return cType;
	}

	/**
	 * @param ageType the ageType to set
	 */
	public void setAgeType(CustomerType ageType) {
		this.cType = ageType;
	}
	
}
