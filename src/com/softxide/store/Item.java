package com.softxide.store;

import java.util.HashMap;

import com.softxide.store.enums.CustomerType;

public abstract class Item {

	private int itemId;
	private String itemName;
	private double itemValue;
	private double discountValue;
	private int itemUnits;
	private ItemClass itemClass;
	private HashMap<CustomerType, Double> customerTypeToDiscountValue;

	public Item(String itemName, double itemValue, double discountValue, ItemClass itmClass, int itemUnits, int id) {
		this.itemClass = itmClass;
		this.itemName = itemName;
		this.itemValue = itemValue;
		this.discountValue = discountValue;
		this.itemClass = itmClass;
		this.itemUnits = itemUnits;
		this.itemId = id;
		this.customerTypeToDiscountValue = new HashMap<>();
	}

	public void addDiscountForCustomerType(CustomerType type, Double val) {
		customerTypeToDiscountValue.put(type, val);
	}

	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * @param itemId
	 *            the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item Id = " + itemId + " Item Name = " + itemName + ", ItemValue = " + itemValue + " Discount Value="
				+ discountValue + ", Item Units = " + itemUnits + ", Item Class = " + itemClass
				+ " Customer type to discount on item  -> " + customerTypeToDiscountValue.toString() + "\n";
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName
	 *            the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the itemValue
	 */
	public double getItemValue() {
		return itemValue;
	}

	/**
	 * @param itemValue
	 *            the itemValue to set
	 */
	public void setItemValue(float itemValue) {
		this.itemValue = itemValue;
	}

	/**
	 * @return the discountValue
	 */
	public double getDiscountValue() {
		return discountValue;
	}

	/**
	 * @param discountValue
	 *            the discountValue to set
	 */
	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}

	/**
	 * @return the itemClass
	 */
	public ItemClass getItemClass() {
		return itemClass;
	}

	/**
	 * @param itemClass
	 *            the itemClass to set
	 */
	public void setItemClass(ItemClass itemClass) {
		this.itemClass = itemClass;
	}

	/**
	 * @return the itemUnits
	 */
	public int getItemUnits() {
		return itemUnits;
	}

	/**
	 * @param itemUnits
	 *            the itemUnits to set
	 */
	public void setItemUnits(int itemUnits) {
		this.itemUnits = itemUnits;
	}

}
