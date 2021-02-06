package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotNum {
	public static void main(String[] args) {
		Random ran = new Random();
		int count;
		String ticket = "";
		
		for (count = 0; count < 6; count++) {
			int num = ran.nextInt(70 - 1 + 1) + 1;
			ticket = ticket + " " + num;
		}
		
		JOptionPane.showMessageDialog(null, ticket);
	}
}
