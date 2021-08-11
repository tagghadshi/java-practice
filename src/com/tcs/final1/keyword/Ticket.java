package com.tcs.final1.keyword;

public class Ticket {
	private final String movie="Sholey";
	private float price;
	
	public final void sell() { // don't want to be overridden, declare method final 
		
	}
	
	public final void sell(float price) { // don't want to be overridden
		
	}
}
class IllegalTicket extends Ticket {
//	public final void sell() { //Declaring this would give a error
//
//	}
}