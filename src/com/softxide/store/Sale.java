package com.softxide.store;

import java.util.ArrayList;

import com.softxide.store.interfaces.SaleStrategy;

public class  Sale {
	
	private SaleStrategy  saleStartegy ;
	public static ArrayList<Item> soldItems =  new ArrayList();
	public static ArrayList<Integer> unitsSold =  new ArrayList<>();
	
	public Sale(SaleStrategy s ) {
		this.saleStartegy = s;
	}
	
	public void printSales(ArrayList<Item> listOfItemSold , int units){
		this.saleStartegy.printSalesOfTheDay(listOfItemSold, units);
	}
	
}
