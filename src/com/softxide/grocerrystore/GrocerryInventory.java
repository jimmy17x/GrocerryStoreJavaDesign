package com.softxide.grocerrystore;
import com.softxide.store.Inventory;
import com.softxide.store.Item;
import com.softxide.store.ItemClass;
import com.softxide.store.enums.CustomerType;
import com.softxide.store.interfaces.InventoryOperations;
import com.softxide.store.utils.Reader;

public class GrocerryInventory extends Inventory implements InventoryOperations{

	private static GrocerryInventory gInventory ;
	GrocerryDiscount gDiscount = new GrocerryDiscount();
	private GrocerryInventory(){
		
	}	
	
	public void initializeInventory() {
		
		int i = 0 ; // variable to store item id
		while(true){
			System.out.println("Add items to inventory , press 0 to continue or - 1 for Transactions");
			int exit = Reader.read.nextInt();
			Reader.read.nextLine();
			
			if(exit  == -1 )
				break;
			
			System.out.println("Item Name : ");
			String itemName = Reader.read.nextLine();
			
			System.out.println("Item Price : ");
			double itemPrice = Reader.read.nextDouble();
			
			Reader.read.nextLine();
			
			System.out.println("Item discount : ");
			double itemDiscount = Double.valueOf(Reader.read.nextLine());
			
			System.out.println("Item Class : ");
			String itemClassName = Reader.read.nextLine();
			
			System.out.println("Item Units : ");
			int itemUnits = Integer.valueOf(Reader.read.nextLine().trim());
			
			ItemClass itemClass =  new ItemClass(itemClassName, 0.0);
			GrocerryItem newItem = new GrocerryItem(itemName,itemPrice,0.0,itemClass,itemUnits,i++); // create new grocerry item with id
			gDiscount.applyDiscount(newItem, itemDiscount); // apply discount on item
			
			System.out.println("ItemClass discount : ");
			double itemClasssDiscount = Double.valueOf(Reader.read.nextLine());
			gDiscount.applyDiscount(itemClass, itemDiscount); // apply discount on item class
			
			System.out.println("Discount for Customer Type on Item ->\nBABY - 0, KID - 1 ,ADULT - 2 ,SENIOR_CITIZEN - 3 ,EMPLOYEE - 4 ");
			int cTypeIndex = Integer.valueOf(Reader.read.nextLine());
			System.out.println("Discount value : ");
			double customerTypeDiscountOnItem = Double.valueOf(Reader.read.nextLine());
			gDiscount.applyDiscount(CustomerType.values()[cTypeIndex],customerTypeDiscountOnItem,newItem); // apply discount on item class
			
			System.out.println("Discount for Customer Type on ItemClass ->\nBABY - 0, KID - 1 ,ADULT - 2 ,SENIOR_CITIZEN - 3 ,EMPLOYEE - 4 ");
			 cTypeIndex = Integer.valueOf(Reader.read.nextLine());
			System.out.println("Discount value : ");
			 customerTypeDiscountOnItem = Double.valueOf(Reader.read.nextLine());
			gDiscount.applyDiscount(CustomerType.values()[cTypeIndex],customerTypeDiscountOnItem,itemClass); // apply discount on item class

			// add item to inventory 
			super.addItemToInventory(itemClass.getItemClassName(),newItem);
		}
		
	}

	public static GrocerryInventory getInstance() {
		if( gInventory == null)
			gInventory = new GrocerryInventory();
		
		return gInventory;
	}

	public Item getItemById(int id,String className) {
		return super.getItemClassToItemListMap().get(className).get(id);
	}

}
