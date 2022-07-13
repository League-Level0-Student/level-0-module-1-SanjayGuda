package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer =	JOptionPane.showInputDialog("What has to be broken before you can use it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
				if (answer.equals("An egg")) {
					score++;
					JOptionPane.showMessageDialog(null, "Correct!");
				}
				else {
				JOptionPane.showMessageDialog(null, "Wrong!, the answer was: An egg ");
				}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

