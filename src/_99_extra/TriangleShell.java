package _99_extra;

import org.jointheleague.graphical.robot.Robot;
public class TriangleShell {
	static Robot triangle = new Robot();
public static void main(String[] args) {
	

	// Create a new Robot

		// This code will draw one triangle whose sides are 100 pixels long....
		// but first you have to write some code. Find the drawTriangle() method and 
		// write the code to draw a triangle.
		
		//drawTriangle(100); 
drawTriangle(100);
		// Run the program. Check that your triangle is the same as the first picture in the recipe.
		// Remove the drawTriangle(100) from the program before you proceed.
		
		
		// Make the robot go as fast as possible
	triangle.setSpeed(100);
		// Make a variable to hold the length of the triangle and set it to 50
	int length = 50;
		// Make another variable to count how many triangles have been drawn and set it to 0
	int count = 0;
		// Start a while loop to draw 60 triangles
while (count < 60) {
	triangle.setRandomPenColor();
	length += 10;
	drawTriangle(length);
	triangle.turn(6);
	count += 1;
}
				//  Change the color of the pen to a random color

				//  Increase the length variable by 10
	
				//  Call the drawTriangle() method using the length variable
		
				//  Turn the robot 6 degrees to the right
		
				// Increase the number of triangles that have been drawn by 1
				// End the while loop here

// Run the program. Check that your pattern looks like the picture in the recipe.
// See if you can figure out how to move the center of the pattern so that it fits in the window
}

private static void drawTriangle(int i) {
	// TODO Auto-generated method stub
triangle.penDown();
triangle.move(100);
triangle.turn(90);
triangle.move(100);
triangle.turn(135);
triangle.move(100);
}
}
	
