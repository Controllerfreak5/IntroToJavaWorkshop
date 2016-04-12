package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot metal = new Robot();

metal.setSpeed(10);


metal.sparkle();

metal.penDown();

metal.setRandomPenColor();

for (int i = 0; i < 7; i++) {
	metal.move(90);
	metal.turn(45);
}

metal.move(90);

metal.penUp();

metal.turn(-45);
metal.move(90);
metal.turn(90);
metal.move(45);


metal.penUp();


	}
}
