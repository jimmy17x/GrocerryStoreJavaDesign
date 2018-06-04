package com.softxide.grocerrystore;

import com.softxide.store.interfaces.StoreOperations;

public class GrocerryStore implements StoreOperations{

	private static GrocerryStore grocerryStoreInstance ;
	private  GrocerryInventory gInventory =  GrocerryInventory.getInstance();
	private GrocerryRegister gRegister =  GrocerryRegister.getInstance(5);// apply 5 total registers by default

	
	public static GrocerryStore getInstance(){
		
		if(grocerryStoreInstance == null)
			grocerryStoreInstance = new GrocerryStore();
		
		return grocerryStoreInstance;
	}
	
	private GrocerryStore(){
		
	}
	
	@Override
	public boolean initializeItemsInInventory() {
		gInventory.initializeInventory();
		return true;
	}

	@Override
	public void printInventory() {
		gInventory.printInventory();
	}

	@Override
	public void doTransaction() {
		GrocerryTransaction gTransaction = new GrocerryTransaction();
		gTransaction.startTransactions(gInventory);
	}

	@Override
	public void printSales() {
	
		System.out.println("Todays total sales ----------->");
		gRegister.getSalesFromRegisters();
	}

	@Override
	public void openStore() {
		System.out.println("Welcome to Grocerry Store ");
		initializeItemsInInventory();
		printInventory();
		applyDiscount();
		doTransaction();
		printSales();
		printInventory();
	}

	private void applyDiscount() {
	}

	@Override
	public void closeStore() {
		
	}
}
