package com.softxide.store.interfaces;

public interface  StoreOperations {
	
	boolean initializeItemsInInventory();
	void printInventory();
	void doTransaction();
	void printSales();	
	void openStore();
	void closeStore();

}
