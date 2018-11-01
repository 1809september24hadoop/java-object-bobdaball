package com.revature;

import com.revature.Driver;
import com.revature.exception.LostTrackOfTimeException;

import org.apache.log4j.Logger;
import com.revature.model.*;
import.

public class Driver {

	private static final Logger LOGGER = Logger.getLogger(Driver.class);
	
	public static void main(String[] args) throws LostTrackOfTimeException {
		PostMeridiam8 endOfDay = new PostMeridiam8("Tacos", true);
		
		endOfDay.eatFood();
		endOfDay.playGames();		
		
	}
}
