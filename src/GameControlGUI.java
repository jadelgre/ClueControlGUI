import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
public class GameControlGUI extends JFrame{

	public GameControlGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 200);
		setTitle("Clue Game");
		JPanel firstPane = buttonPanel();
		JPanel secondPane = infoPanel();
		add(firstPane, BorderLayout.SOUTH);
		add(secondPane, BorderLayout.CENTER);
	}
	// Create a panel to display the buttons in
	private JPanel buttonPanel() {
		JPanel temp = new JPanel();
		temp.setLayout(new GridLayout(1,2));;
		JButton next = new JButton("Next player");
		JButton accuse = new JButton("Make an accusation");
		temp.add(next);
		temp.add(accuse);
		return temp;
	}
	// Create a panel to display roll, turn, guesses
	private JPanel infoPanel() 
	{
		JPanel temp = new JPanel();
		temp.setLayout(new GridLayout(1,3));
		
		JPanel temporary = new JPanel();
		temporary.setLayout(new GridLayout(1,2));
		
		JLabel nameLabeler = new JLabel("Which player's turn?");
		JTextField nameLabel = new JTextField(20);
		nameLabel.setEditable(false);
		temporary.add(nameLabeler);
		temporary.add(nameLabel);
		temporary.setBorder(new EtchedBorder());
		
		temp.add(temporary);
		
		JButton rollButton = new JButton("Roll the die!");
		temp.add(rollButton);
		
		temporary = new JPanel();
		temporary.setLayout(new GridLayout(3,2));
		
		JLabel rollResult = new JLabel("Roll Result");
		JTextField rollNumber = new JTextField(1);
		rollNumber.setEditable(false);
		JLabel guesser = new JLabel("Last Guess");
		JTextField guess = new JTextField(20);
		guess.setEditable(false);
		JLabel guesserResult = new JLabel("Last Guess Result");
		JTextField guessResult = new JTextField(20);
		guessResult.setEditable(false);
		temporary.add(rollResult);
		temporary.add(rollNumber);
		temporary.add(guesser);
		temporary.add(guess);
		temporary.add(guesserResult);
		temporary.add(guessResult);
		temporary.setBorder(new EtchedBorder());
		temp.add(temporary);
		
		return temp;
	}
	public static void main(String[] args) {
		GameControlGUI demo = new GameControlGUI();
		demo.setVisible(true);
	}

}
