package _03_print_and_popups._4_quiz_game;

import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int Score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String player1 = JOptionPane.showInputDialog("2+2");
				// 3.  Use an if statement to check if their answer is correct
				if (player1.equalsIgnoreCase("4")) {
					Score += 1;
				}
				// 4.  if the user's answer was correct, add one to their score 
				String player2 = JOptionPane.showInputDialog("6-5"); 
				if (player2.equalsIgnoreCase("1")) {
					Score += 1;
				}
					
				String player3 = JOptionPane.showInputDialog("4*8");
				if (player3.equalsIgnoreCase("32")) {
					Score += 1;
				}
				String player4 = JOptionPane.showInputDialog("63/9");
				if (player4.equalsIgnoreCase("7")) {
					Score += 1;
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, Score);
	}
}
