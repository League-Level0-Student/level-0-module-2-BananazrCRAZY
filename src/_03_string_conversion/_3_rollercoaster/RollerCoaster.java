package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
		String heightToRide = JOptionPane.showInputDialog("Enter your height in inches.");
		
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse...
		int heightToInt = Integer.parseInt(heightToRide);
		 
		if( heightToInt >= 48 ) {
			
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane
			
			JOptionPane.showMessageDialog(null, "Hurray! You are tall enough to ride the coaster alone!");
			
		} else if (heightToInt >= 42) {
			
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
			
			JOptionPane.showMessageDialog(null, "You can ride the coaster with someone else!");
			
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
		} else {
			JOptionPane.showMessageDialog(null, "You must be at least 42 inches tall to ride the roller coaster pal!");
		}
	}
} 
