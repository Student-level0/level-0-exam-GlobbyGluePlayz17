import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot artist = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw
    	String color = JOptionPane.showInputDialog("Which color would you like the Robot to use?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	for (int i = 0; i < 4; i++) {
    	if (color.equalsIgnoreCase("red")) {
			artist.setPenColor(255, 0, 0);
		} else if (color.equalsIgnoreCase("orange")) {
			artist.setPenColor(244, 158, 66);
		} else if (color.equalsIgnoreCase("yellow")) {
			artist.setPenColor(255, 255, 0);
		} else if (color.equalsIgnoreCase("green")) {
			artist.setPenColor(0, 255, 0);
		} else if (color.equalsIgnoreCase("blue")) {
			artist.setPenColor(0, 0, 255);
		} else if (color.equalsIgnoreCase("purple")) {
			artist.setPenColor(100, 5, 100);
		} else if (color.equalsIgnoreCase("pink")) {
			artist.setPenColor(244, 66, 229);
		} else if (color.equalsIgnoreCase("black")) {
			artist.setPenColor(0, 0, 0);
		} else {
			JOptionPane.showMessageDialog(null, "Error. You did not enter a color.");
			break;
		}
   	 // 2. set the pen width to 10
    	artist.penDown();
    	artist.setPenWidth(10);
   	 // 1. make the Robot draw a shape
			artist.setSpeed(100);
   	 		artist.move(100);
			artist.turn(90);
		}
    }
}

//127.5 - red

//63.55