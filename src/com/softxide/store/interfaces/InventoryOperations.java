package com.softxide.store.interfaces;

import com.softxide.store.Item;

public interface InventoryOperations {
	void initializeInventory();
	Item getItemById(int id, String className);
}
