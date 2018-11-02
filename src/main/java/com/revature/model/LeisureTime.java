package com.revature.model;

import java.util.Random;

import com.revature.exception.LostTrackOfTimeException;


public abstract class LeisureTime {
	private boolean isLate;
	boolean hadFun;
	/*
	 * getters and setters for isLate boolean, which determines outcome.
	 */
	public boolean isLate() {
		return isLate;
	}

	public void setLate(boolean isLate) {
		this.isLate = isLate;
	}

	/*
	 * First it checks for the late boolean, and prepares 2 different outcomes.
	 * The non-late outcome also has a 50% chance to throw error because person stayed up too late.
	 */
	public void playGames() throws LostTrackOfTimeException {
		// TODO Auto-generated method stub
		String message;

		
		message = !isLate() && hadFun ? "Glad I got to play some games today" : "No time to play, gotta go to sleep!";
		
		Random rngesus = new Random();
		boolean lostTrack = rngesus.nextBoolean();
		
		if (!isLate() && hadFun) {
			message = lostTrack ? "Oh no! It's already 3am!" : message;
		}
		
		System.out.println(message);
		
		if (lostTrack && !isLate() && hadFun) {
			throw new LostTrackOfTimeException("There goes my sleep.");
		}
	}
}
