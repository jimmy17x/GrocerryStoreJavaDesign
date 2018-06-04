package com.softxide.store;

public class ItemSoldPOJO {
	private Item item;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemSoldPOJO [item=" + item + ", unitSold=" + unitSold + "]\n";
	}

	private int unitSold;
	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	/**
	 * @return the unitSold
	 */
	public int getUnitSold() {
		return unitSold;
	}
	/**
	 * @param unitSold the unitSold to set
	 */
	public void setUnitSold(int unitSold) {
		this.unitSold = unitSold;
	}
	
	public ItemSoldPOJO(Item it , int units){
		this.item = it;
		this.unitSold = units;
	}

}
