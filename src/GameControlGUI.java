import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class GameControlGUI extends JFrame{

	public GameControlGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setTitle("Clue Game");
		JPanel firstPane = buttonPanel();
		JPanel secondPane = infoPanel();
		add(firstPane, BorderLayout.SOUTH);
		add(secondPane, BorderLayout.NORTH);
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
	private JPanel infoPanel() {
		JPanel temp = new JPanel();
		return temp;
	}
	public static void main(String[] args) {
		GameControlGUI demo = new GameControlGUI();
		demo.setVisible(true);
	}

}
