//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;
import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		 Robot Turtle = new Robot();
		Turtle.penDown();
		Turtle.setSpeed(1000);
		//3. Ask the user what color they would like the robot to draw
String color = JOptionPane.showInputDialog("What color would you like your robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equals("Red")) {
	Turtle.setPenColor(255,0,0);
}
else if (color == "Brown") {
	Turtle.setPenColor(0, 255, 255);
} else if (color == "Blue") {
	Turtle.setPenColor(0, 0, 255);
} else if (color == "Purple") {
	Turtle.setPenColor(255, 0, 255);
} else if (color == "Green") {
	Turtle.setPenColor(0, 255, 0);
} else { 
	Turtle.setRandomPenColor();;
}
Turtle.setPenWidth(10);
Turtle.move(90);
Turtle.turn(90);
Turtle.move(90);
Turtle.turn(90);
Turtle.move(90);
Turtle.turn(90);
Turtle.move(90);
Turtle.turn(90);
}
	
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}

