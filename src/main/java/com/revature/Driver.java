package com.revature;

import com.revature.Driver;
import com.revature.exception.LostTrackOfTimeException;
import com.revature.exception.InsomniaException;

import org.apache.log4j.Logger;
import com.revature.model.*;
import java.util.Random;


public class Driver {

	private static final Logger LOGGER = Logger.getLogger(Driver.class);
	
	public static void main(String[] args) throws LostTrackOfTimeException {
		PostMeridiam8 endOfDay = new PostMeridiam8("Tacos", true);
		
		System.out.println("And today's another day for Fred Sleepman, a man who struggles to have fun, eat well, and sleep enough at the same time");
		System.out.println("How will today go for him? Let's find out!");
		endOfDay.eatFood();
		endOfDay.playGames();		
		
		Random rnGesus = new Random();
		
		boolean insomniac = rnGesus.nextBoolean();
		
		
		if (insomniac) {
			throw new InsomniaException("Whelps, can't sleep. Tomorrow's going to be horrible");
		} else {
			System.out.println("And he slept happily ever after.");
		}
	}
}
