package com.revature;

import com.revature.Driver;
import com.revature.exception.LostTrackOfTimeException;

import java.util.Scanner;

//import org.apache.log4j.Logger;
import com.revature.model.*;
import java.util.Random;


public class Driver {

	
//	private static final Logger LOGGER = Logger.getLogger(Driver.class);
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) throws LostTrackOfTimeException {
		System.out.println("And today's another day for Fred Sleepman, a man who struggles to have fun, eat well, and sleep enough at the same time");
		System.out.println("How will today go for him? Let's find out!");
//		System.out.print("your name?");
//		String inputName = scanner.nextLine();
		
		Random rnGesus = new Random();
		
		final int randInt = rnGesus.nextInt(3);
		PostMeridiam8 endOfDay = null;
		
		
		switch(randInt) {
		case 0:
			endOfDay = new PostMeridiam8();
			break;
			
		case 1:
			System.out.print("Are you late?");
			String amILate = scanner.nextLine();
			
			boolean lateOrNot = amILate.equals("yes");
			
			endOfDay = new PostMeridiam8(lateOrNot);
			break;
			
		case 2:
			System.out.print("What are you eating for dinner?");
			String food = scanner.nextLine();
			
			System.out.print("Do you have enough time to play games?");
			String timeForGames = scanner.nextLine();
			boolean playedGames = timeForGames.equals("yes");
			endOfDay = new PostMeridiam8(food, playedGames);
			break;
		}
		
		endOfDay.eatFood();
		endOfDay.playGames();		
		endOfDay.insomniacRoll();

	}
}
