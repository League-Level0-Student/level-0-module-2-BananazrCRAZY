
package _99_extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown or the rocket won't launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for '11': 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {
		// 2. Use a pop-up to ask the user where to start counting from
		String countdown = JOptionPane.showInputDialog("Where to start the countdown?");
		// 3. Change the countdown to use the new starting point
		int countdown2 = Integer.parseInt(countdown);
		// 1. Print a countdown from 10 to 0 on the console
		for (countdown2 = countdown2; countdown2 >= 0; countdown2 -= 1) {
			// 4. Use the speak method to hear the countdown.
			JOptionPane.showMessageDialog(null, countdown2);
			// 6. Use the following code to make the program wait one second for each number: Thread.sleep(1000);
			Thread.sleep(1000);
		// 5. when the counting is done, speak "blastoff!"
			if (countdown2 == 0) {
				JOptionPane.showMessageDialog(null, "Blast Off!!!");
			}
		}
	}

static void speak(String words) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


