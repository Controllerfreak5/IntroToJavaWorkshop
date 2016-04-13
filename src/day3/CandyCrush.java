package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String hated = JOptionPane.showInputDialog("Who do you hate with a burning passion?");

		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + hated);
		// 3. Ask the user for the name of their best friend
String friend = JOptionPane.showInputDialog("What is the name of your best friend?");
		// 4. Tell them their best friend is as sweet as candy
if (friend.equals("donald trump")) {
	JOptionPane.showMessageDialog(null, "why.");
	} else { JOptionPane.showMessageDialog(null, "Your friend is as sweet as candy!"); 
	}
	}
}
