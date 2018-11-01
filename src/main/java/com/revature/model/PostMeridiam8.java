package com.revature.model;

public class PostMeridiam8 implements DinnerTime {
	boolean isLate = false;
	boolean isSatisfied = false;
	boolean isHungry = true;
	
	
	//overloaded constructor 1
	public PostMeridiam8 (boolean isLate, boolean isSatisfied, boolean isHungry) {
		this.isLate = isLate;
		this.isSatisfied = isSatisfied;
		this.isHungry = isHungry;
	}
	public static void main() {
		
	}
}
