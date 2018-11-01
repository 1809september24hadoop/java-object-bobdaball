package com.revature.model;

public class PostMeridiam8 extends LeisureTime implements DinnerTime {
	boolean isLate = false;
	boolean hadFun = false;
	String foodEaten = "delicious H2O";
	
	
	//overloaded constructor 1
	public PostMeridiam8 (String foodEaten, boolean hadFun) {
		this.hadFun = hadFun;
		this.foodEaten = foodEaten;
	}
	
	public PostMeridiam8 (boolean isLate) {
		this.isLate = isLate;
		if (this.isLate == false) {
			this.hadFun = true;
			this.foodEaten = "the usual";
		}
	}
	public static void main() {
		
	}
	@Override
	public void eatFood() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playGames() {
		// TODO Auto-generated method stub
		
	}
}
