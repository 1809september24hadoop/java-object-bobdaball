package com.revature.model;

import com.revature.exception.LostTrackOfTimeException;

public interface DinnerTime {
	void eatFood();
	void playGames() throws LostTrackOfTimeException;
}
