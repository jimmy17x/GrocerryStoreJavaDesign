package com.softxide.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

// an abstract inventory class
public  abstract class Inventory {
	private static HashMap<String, HashMap<Integer,Item>> itemClassToItemListMap = new HashMap(); // static map to save inventory

	
	//adds item to inventory for a class name 
	public void  addItemToInventory(String itemClassName, Item item) {

		HashMap<Integer,Item>listMap = this.getItemsOfClass(itemClassName);

		if (listMap != null) {
			// add item to map
			itemClassToItemListMap.get(itemClassName);
			listMap.put(item.getItemId(),item);

		} else {
			// create a new map and add item
			listMap = new HashMap();
			listMap.put(item.getItemId(),item);
			itemClassToItemListMap.put(itemClassName, listMap);
		}

		
	}

	// returns items for a given class if present
	public HashMap<Integer,Item> getItemsOfClass(String itemClassName) {

		if (itemClassToItemListMap.containsKey(itemClassName)) {
			HashMap<Integer,Item> list = itemClassToItemListMap.get(itemClassName);
			return list;
		}

		return null;
	}
	
	/**
	 * @return the itemClassToItemListMap
	 */
	public HashMap<String, HashMap<Integer,Item>> getItemClassToItemListMap() {
		return itemClassToItemListMap;
	}

	/**
	 * @param itemClassToItemListMap the itemClassToItemListMap to set
	 */
	public void setItemClassToItemListMap(HashMap<String, HashMap<Integer,Item>>  itemClassToItemListMap) {
		this.itemClassToItemListMap = itemClassToItemListMap;
	}

	public void printInventory() {
		System.out.println("Inventory details");
		for(Entry<String,HashMap<Integer,Item>> entry : itemClassToItemListMap.entrySet()){
			System.out.println(entry.getValue().toString());
		}
		
	}
}
