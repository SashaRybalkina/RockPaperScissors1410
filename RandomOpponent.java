package a8;

import java.util.Random;

// Choose one enum from RPS randomly. See the lecture on enums 
// for an example of choosing a random item from an enum.
// RPS is defined in RPS.java.
public class RandomOpponent implements Opponent {

	@Override
	public RPS getResponse(RPS humanMove) {
		
		Random randomGenerator = new Random();
		
		int chooseRandom = randomGenerator.nextInt(3);
		
		return RPS.values()[chooseRandom];
	}
		
}