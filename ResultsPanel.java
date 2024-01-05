package a8;

import java.awt.GridLayout;

import javax.swing.*;

import a8.RPS;
import a8.ResultsPanel;

@SuppressWarnings("serial")
public class ResultsPanel extends JPanel {
 
	JLabel humanChoice;
	JLabel computerChoice;
	JLabel winner;
	JPanel results;

	// The results panel clearly communicate the choices made by the 
	// player and the computer and show who won. You will likely need
	// some instance variables so the updateResults method can access
	// parts of the panel to update them. A layout will help arrange
	// these parts of the panel.
    public ResultsPanel() {
    	results = new JPanel();
    	humanChoice = new JLabel("Human Choice: no selection");
    	results.add(humanChoice);
    	computerChoice = new JLabel("Computer Choice: no selection");
    	results.add(computerChoice);
    	winner = new JLabel("Winner: none");
    	results.add(winner);
    	
    	results.setLayout(new GridLayout(3,1));
    	
    	this.add(results);
    	
    }
    
    public void updateResults(RPS human, RPS computer, String winner) {
    	
    	if (human == RPS.ROCK) {
    		humanChoice.setText("Human Choice: Rock");
    	}
    	else if (human == RPS.PAPER) {
    		humanChoice.setText("Human Choice: Paper");
    	}
    	else if (human == RPS.SCISSORS) {
    		humanChoice.setText("Human Choice: Scissors");
    	}
    	if (computer == RPS.ROCK) {
    		computerChoice.setText("Computer Choice: Rock");
    	}
    	else if (computer == RPS.PAPER) {
    		computerChoice.setText("Computer Choice: Paper");
    	}
    	else if (human == RPS.SCISSORS) {
    		computerChoice.setText("Computer Choice: Scissors");
    	}
    	this.winner.setText(winner);
    }
    
    // Example test code to test this frame
    public static void main(String[] args) {
    	
        JFrame testFrame = new JFrame("test results");
        
        // Code similar to the following can be used to test
        // this panel on its own. You can create a panel
        // and call methods on it without worrying
        // how the other panels interact with it.
        ResultsPanel testPanel = new ResultsPanel();
        testPanel.updateResults(RPS.ROCK, RPS.PAPER, "computer");
        
        testFrame.pack();
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setVisible(true);
    }
    
}
