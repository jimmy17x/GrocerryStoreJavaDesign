package com.softxide.store;

import java.util.Scanner;


import com.softxide.constants.StoreConfigurations;
import com.softxide.grocerrystore.GrocerryStore;

public class Main {
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Universal Store Manager");
		System.out.println("Total Stores available : " + StoreConfigurations.TOTAL_AVAILABLE_STORE_TYPES);
		
		// select store type from available stores
		System.out.println("Type store type  for performing operation :");
		for(int i = 0 ; i < StoreConfigurations.TOTAL_AVAILABLE_STORE_TYPES ; ++i)
		{
			System.out.println(StoreConfigurations.AVAILABLE_STORE_TYPES[i] + " press " + (i+1) );
		}
		
		Scanner reader = new Scanner(System.in);
		int storeType = reader.nextInt();
		
		switch(storeType)
		{
			case 1:
				// open grocerry store
				GrocerryStore.getInstance().openStore();
				break;
			default :
				System.out.println("Store with id :" + storeType + " is not available .\nAdd more store in system .");
		}
		
		
	}

}
