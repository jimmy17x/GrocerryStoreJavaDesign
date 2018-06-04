package com.softxide.store.interfaces;

import java.util.ArrayList;

import com.softxide.store.Item;

public interface SaleStrategy {
	public void printSalesOfTheDay(ArrayList<Item> list, int units );
}
