package com.softxide.store.interfaces;

import com.softxide.store.Item;
import com.softxide.store.ItemClass;
import com.softxide.store.enums.CustomerType;

public interface DiscountStartegy {
	void applyDiscount(Item item ,double discountValue);// for item
	void applyDiscount(ItemClass item ,double discountValue); // for item class
	void applyDiscount(CustomerType cType ,double discountValue,Item item); // for customer type on item
	void applyDiscount(CustomerType cType ,double discountValue,ItemClass itemClass);// for customer type on item class
}
