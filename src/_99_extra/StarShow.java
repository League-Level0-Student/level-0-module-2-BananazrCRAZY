
package _99_extra;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot bot = new Robot("batman");
	
	void makeStars() {
		
		drawStar(150);
		// 13. Set the speed to 
		bot.setSpeed(100);
		// 6. Make a variable to hold the X position of the Robot and set it to 10
		int xPos = 10;
		// 7. Make a variable to hold the Y position of the Robot and set it to 600
		int yPos = 600;
		// 8. Make a variable to hold the star size and set it to 25
		int ss = 25;
		// 12. Repeat the steps #19 to #18, 30 times
		int count;
		for (count = 0; count < 30; count++) {
			// 19. Set the pen width to i 
			bot.setPenWidth(1);
			// 10. Set the X position of the robot to your X variable
			bot.setX(xPos);
			// 11. Set the Y position of the robot to your Y variable
			bot.setY(yPos);
			// 9. Call the drawStar() method with your star size variable
			drawStar(ss);
			// 14. Increase the X position by star size. See Figure 2.
			xPos = xPos + ss;
			// 15. decrease the Y position by star size. See Figure 3.
			yPos = yPos - ss;
			// 16. Increase the star size by 20
			ss += 20;
			// 17. Turn the robot 12 degrees
			bot.turn(12);
			// 18. Make each star a different random color like in Figure 4. 
			bot.setRandomPenColor();
		}
	}

	private void drawStar(int starSize) {
		int count;
		// 2. Put the robot's pen down
		bot.penDown();

		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
		for (count = 0; count < 5; count++) {
			// 1. Move the robot the distance of the starSize variable
			bot.move(starSize);
	
			// 3. Turn the robot 144 degrees
			bot.turn(144);
		}
			
	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}





