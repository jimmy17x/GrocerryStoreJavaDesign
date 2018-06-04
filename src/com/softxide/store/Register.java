package com.softxide.store;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Register {
	
	private int ttlRegisters ;
	private static HashMap<Integer,ArrayList<ItemSoldPOJO>> registerIdToItems ; // hashmap containing registerId to list of items sold
	
	public Register(){
		this.registerIdToItems = new HashMap<>();
	}
	// add item to map if it is present else create new register and then add it
	public  void addItemToRegister(int registerId,Item item, int units){
		ItemSoldPOJO itemPojo = new ItemSoldPOJO(item, units); // create an item sold pojo
		
		if(registerIdToItems.containsKey(registerId)){
			registerIdToItems.get(registerId).add(itemPojo);
		}else{
			registerIdToItems.put(registerId, new ArrayList<ItemSoldPOJO>());
			registerIdToItems.get(registerId).add(itemPojo);
		}
	}
	
	/**
	 * @return the registerIdToItems
	 */
	public HashMap<Integer, ArrayList<ItemSoldPOJO>> getRegisterIdToItems() {
		return registerIdToItems;
	}

	/**
	 * @param registerIdToItems the registerIdToItems to set
	 */
	public void setRegisterIdToItems(HashMap<Integer, ArrayList<ItemSoldPOJO>> registerIdToItems) {
		this.registerIdToItems = registerIdToItems;
	}

	public abstract void getSalesFromRegisters();
	
	/**
	 * @return the ttlRegisters
	 */
	public int getTtlRegisters() {
		return ttlRegisters;
	}

	/**
	 * @param ttlRegisters the ttlRegisters to set
	 */
	public void setTtlRegisters(int ttlRegisters) {
		this.ttlRegisters = ttlRegisters;
	}
	
	
}
