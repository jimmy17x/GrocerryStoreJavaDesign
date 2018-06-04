package com.softxide.grocerrystore;
import java.util.ArrayList;

import com.softxide.store.Customer;
import com.softxide.store.Inventory;
import com.softxide.store.Item;
import com.softxide.store.Sale;
import com.softxide.store.Transactions;
import com.softxide.store.utils.Reader;

public class GrocerryTransaction extends Transactions {

	private GrocerryInventory gInventory = GrocerryInventory.getInstance();
	private GrocerryRegister gRegister =  GrocerryRegister.getInstance(5);// apply 5 total registers by default

	@Override
	public void buyItem( int id ,Customer customer) {		
		GrocerryInventory gInventory = GrocerryInventory.getInstance();
		
//		GrocerryItem item = gInventory.getItem(id);
	}
	@Override
	public void startTransactions(Inventory inventory) {
		
	
		while(true){
			
			System.out.println("Select item for transaction -> press 0 to continue or press -1 to exit");

			int selection = Integer.valueOf( Reader.read.nextLine());
			
			// if selection is not to continue break
			if(selection !=0)
				break;
			
			// input transaction data
			System.out.println("Item Id:");
			int id = Integer.valueOf( Reader.read.nextLine());
			
			System.out.println("Item Class:");
			String className =  Reader.read.nextLine();
			
			Item currentItem = gInventory.getItemById(id,className);
			int availableUnits = currentItem.getItemUnits();
			
			System.out.println("Total Units of "+ currentItem.getItemName() + " (Available : " + availableUnits + " ) :" );		
			int units = Integer.valueOf(Reader.read.nextLine().trim());
			
			currentItem.setItemUnits(availableUnits - units); // update available units
			
			System.out.println("Select Register 1 - "+gRegister.getTtlRegisters());
			int registerId = Integer.valueOf(Reader.read.nextLine());
			
			// add sold item to register
			gRegister.addItemToRegister(registerId, currentItem,units);	
		}
		
	
		
		
	}
}
