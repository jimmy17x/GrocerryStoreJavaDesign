package com.softxide.grocerrystore;

import com.softxide.store.Item;
import com.softxide.store.ItemClass;
import com.softxide.store.enums.CustomerType;
import com.softxide.store.interfaces.DiscountStartegy;

public class GrocerryDiscount implements DiscountStartegy{

	@Override
	public void applyDiscount(Item item, double discountValue) {
		// TODO Auto-generated method stub
		item.setDiscountValue(discountValue);
		
	}

	@Override
	public void applyDiscount(ItemClass itemClass, double discountValue) {
		// TODO Auto-generated method stub
		itemClass.setDiscountValue(discountValue);
	}

	@Override
	public void applyDiscount(CustomerType cType, double discountValue, Item item) {
		// TODO Auto-generated method stub
		item.addDiscountForCustomerType(cType, discountValue);
	}

	@Override
	public void applyDiscount(CustomerType cType, double discountValue, ItemClass itemClass) {
		// TODO Auto-generated method stub
		itemClass.addDiscountForCustomerType(cType, discountValue);
		
	}

}
