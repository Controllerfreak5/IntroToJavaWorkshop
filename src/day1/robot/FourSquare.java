package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot metal = new Robot();
	

	void go() {
		// 4. Make the robot move as fast as possible
		metal.setSpeed(10);

		// 5. Set the pen width to 5
		metal.setPenWidth(5);

		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 100; i++) {
			
		

			// 7. Set the pen color to random
	       metal.setRandomPenColor();
			// 1. Call the drawSquare() method
		    drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
		    metal.turn(90);

		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() { 
		
		metal.penDown();
		
		for (int i = 0; i < 4; i++) {
		
		metal.move(100);
		metal.turn(5000*i);
		}
	}
	public static void main(String[] args) {
		new FourSquare().go();
	}

}
