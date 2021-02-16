package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class ageAsk {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("Input your age in years");
		int tAge = Integer.parseInt(age);
		
		if (tAge < 18) {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		} else {
			JOptionPane.showMessageDialog(null, "Who should the next president be?");
		}
	}
}
