package a8;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class UserPanel extends JPanel implements ActionListener{
    private Battle parent;
    private JButton rock = new JButton("Rock");
    private JButton scissors = new JButton("Scissors");
    private JButton paper = new JButton("Paper");
    private JPanel panel;

    // This panel should have three buttons for 
    // rock, paper, or scissors. If a button is pushed,
    // then this choice should be send to parent.playGame()
    // where the winner is chosen and the results panel updated.
    public UserPanel(Battle parent) {
    	
        super();
        
        panel = new JPanel();
        
        rock.addActionListener(this);
        scissors.addActionListener(this);
        paper.addActionListener(this);
        
        
        panel.add(rock);
        panel.add(scissors);
        panel.add(paper);
        
        panel.setLayout(new GridLayout(3, 1));
        
        ButtonGroup group = new ButtonGroup();
        group.add(rock);
        group.add(paper);
        group.add(scissors);
        
        // Store the Battle object so we can call playGame().
        this.parent = parent;
        
        this.add(panel);
    }
    
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rock)
			parent.playGame(RPS.ROCK);
		if (e.getSource() == paper)
			parent.playGame(RPS.PAPER);
		if (e.getSource() == scissors)
			parent.playGame(RPS.SCISSORS);
		}
    }
