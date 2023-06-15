package _99_extra;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	public static void main(String[] args) {
		

	// Create a new Robot
 Robot league = new Robot("league");		
		// Make the robot move quickly (setSpeed)
league.setSpeed(100);
		// Set the robot's pen width to 5                   
		league.setPenWidth(5);
		// Put the robot's pen down
		league.penDown();
		// This numberOfSquares variable will track how many squares the robot has drawn
		// It's set to zero here, because the robot hasn't drawn any squares yet.
	int numberOfSquares = 0;
		// LOOP: Start a while loop to repeat the following code until 4 squares have been drawn:
		while (numberOfSquares < 4) {
			league.setRandomPenColor();
			drawSquare(league);
			league.turn(90);
			numberOfSquares += 1;
			
		}
				// PEN COLOR.     Set the pen color to random       setRandomPenColor()
		
				// DRAW A SQUARE. Call the drawSquare() method.  Have you put some code in it?
	
				// TURN.          Turn the robot 90 degrees to the right
		
			    // INCREASE COUNT. Add one to the number of squares drawn

		// End the loop here

	

		/*  Put code here to draw one square - don't forget to use a loop! */
		
}

	private static void drawSquare(Robot league) {
		// TODO Auto-generated method stub
		
	}

}	





