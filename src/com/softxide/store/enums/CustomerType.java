package com.softxide.store.enums;

public enum CustomerType {
	BABY(0),KID(1),ADULT(2),SENIOR_CITIZEN(3),EMPLOYEE(4);
	
    private final int  id;

	CustomerType(int i){
		id = i;
	}
	
}
