package com.revature.model;
import java.util.Random;
import com.revature.exception.LostTrackOfTimeException;

public class PostMeridiam8 extends LeisureTime implements DinnerTime {
	boolean isLate;
	boolean hadFun;
	String foodEaten;
	
	
	//overloaded constructor 1
	public PostMeridiam8 (String foodEaten, boolean hadFun) {
		this.isLate = false;
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
	
	public PostMeridiam8 () {
		isLate = false;
		hadFun = false;
		foodEaten = "delicious H2O";
	}

	@Override
	public void eatFood() {
		// TODO Auto-generated method stub
		String message;
		message = !this.isLate ? "Yum yum! " + this.foodEaten + " tastes wonderful" : "Don't have time to eat :(";
		System.out.println(message);
	}
	@Override
	public void playGames() throws LostTrackOfTimeException {
		// TODO Auto-generated method stub
		String message;
		message = !this.isLate ? "Glad I got to play some games today" : "No time to play, gotta go to sleep!";
		
		Random rngesus = new Random();
		boolean lostTrack = rngesus.nextBoolean();
		
		if (!this.isLate) {
			message = lostTrack ? "Oh no! It's already 3am!" : message;
		}
		
		System.out.println(message);
		
		if (lostTrack) {
			throw new LostTrackOfTimeException("There goes my sleep.");
		}
	}
}
