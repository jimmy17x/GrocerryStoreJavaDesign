package com.softxide.grocerrystore;

import com.softxide.store.Item;
import com.softxide.store.ItemClass;

public class GrocerryItem extends Item {

	public GrocerryItem(String itemName, double itemValue, double discountValue, ItemClass itmClass,int itemUnits,int id) {
		super(itemName, itemValue, discountValue, itmClass,itemUnits,id);
	}

}
