
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
			int year = 2017;
			String age = JOptionPane.showInputDialog("How many years have you been alive?");
			int age2 = Integer.parseInt(age);
			int yearborn = 2017 - age2;
			JOptionPane.showMessageDialog(null, "You were born the year " + yearborn);
			if (age2 > 30) {
				JOptionPane.showMessageDialog(null, "You are too old to play this game");
			} else {
				JOptionPane.showMessageDialog(null, "Hi... :O");
			}
		}
}



