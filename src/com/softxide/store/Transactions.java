package com.softxide.store;

public abstract class Transactions {
	
	public abstract void buyItem(int  itemId, Customer customer) ;
	public  abstract void startTransactions(Inventory inventory) ;

}
