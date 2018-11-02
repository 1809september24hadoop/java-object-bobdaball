package com.revature.model;
import java.util.Random;

import com.revature.exception.InsomniaException;

public class PostMeridiam8 extends LeisureTime implements DinnerTime {

	String foodEaten;
	
	
	//overloaded constructor 1
	public PostMeridiam8 (String foodEaten, boolean hadFun) {
		setLate(false);
		this.hadFun = hadFun;
		this.foodEaten = foodEaten;
	}
	
	public PostMeridiam8 (boolean isLate) {
		setLate(isLate);
		if (!isLate()) {
			this.hadFun = true;
			this.foodEaten = "the usual";
		}
	}
	// default if no parameters are thrown in.
	public PostMeridiam8 () {
		setLate(false);
		hadFun = false;
		foodEaten = "delicious H2O";
	}
	
	// regardless of outcome, this roll is made at the end. if the roll fails (results in 0), an error is thrown.
	public void insomniacRoll() {
		Random rnGesus = new Random();
		boolean insomniac = rnGesus.nextBoolean();
		
		if (insomniac) {
			throw new InsomniaException("Whelps, can't sleep. Tomorrow's going to be horrible");
		} else {
			System.out.println("And he slept happily ever after.");
		}
	}
	
	/*
	 * eatFood Method determines the message, two outcomes depending on isLate boolean
	 */
	@Override
	public void eatFood() {
		String message;
		message = !isLate() ? "Yum yum! " + this.foodEaten + " tastes wonderful" : "Don't have time to eat :(";
		System.out.println(message);
	}
}
