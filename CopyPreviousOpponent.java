package a8;

//Choose the move made by a player the previous round. Start with RPS.ROCK 
// for the first move, or when first changing to this opponent.
//RPS is defined in RPS.java.
public class CopyPreviousOpponent implements Opponent {
	
	private RPS previousMove;
	
	public CopyPreviousOpponent() {
		
		previousMove = RPS.ROCK;
		
	}

	@Override
	public RPS getResponse(RPS humanMove) {
		
		RPS firstPrevious = previousMove;
		
		previousMove = humanMove;
		
		return firstPrevious;
		
	}
	
  }
