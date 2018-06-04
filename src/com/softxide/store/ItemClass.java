package com.softxide.store;

import java.util.HashMap;

import com.softxide.store.enums.CustomerType;

public class ItemClass {
	
	private String itemClassName ;
	private double discountValue;
	private HashMap<CustomerType,Double> customerTypeToDiscountValue = new HashMap<>();

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  itemClassName + ", Discount on Class =" + discountValue+ "Customer type to discount on class -> " + customerTypeToDiscountValue.toString() +   " " ;
	}

	public ItemClass(String className , double discountValue)
	{
		this.itemClassName = className;
		this.discountValue = discountValue;
	}

	public double getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}

	public String getItemClassName() {
		return itemClassName;
	}

	public void setItemClassName(String itemClassName) {
		this.itemClassName = itemClassName;
	}

	public void addDiscountForCustomerType(CustomerType cType, double discountValue) {
		this.customerTypeToDiscountValue.put(cType, discountValue);
	}
	
}
