package com.softxide.grocerrystore;

import com.softxide.store.Register;

public class GrocerryRegister extends Register {

	private static GrocerryRegister gRegisterInstance ;
	@Override
	public void getSalesFromRegisters() {
		System.out.println(super.getRegisterIdToItems().toString());
	}
	
	private GrocerryRegister(int ttlRegisters){
		super.setTtlRegisters(ttlRegisters);
	}

	public static GrocerryRegister getInstance(int registers) {
		if(gRegisterInstance == null){
			gRegisterInstance = new GrocerryRegister(registers);
		}
		
		return gRegisterInstance;
	}

}
