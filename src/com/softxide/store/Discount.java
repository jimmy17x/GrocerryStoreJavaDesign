package com.softxide.store;

import com.softxide.store.interfaces.DiscountStartegy;

public class Discount {
	DiscountStartegy dStart ;
	
	public Discount(DiscountStartegy dStart){
		this.dStart = dStart;
	}
}
