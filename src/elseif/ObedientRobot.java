package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	String shape = JOptionPane.showInputDialog("What shape do you want");
	
		
	if(shape.equals("Triangle")) {
		drawTriangle();
	}
	else if (shape.equals("Square")) {
		drawSquare();
	}
	else if(shape.equals("Circle")) {
		drawCircle();
	}
	
}

static void drawSquare() {
	Robot r = new Robot();
r.setSpeed(90000);
r.penDown();
r.move(90);
r.turn(90);
r.move(90);
r.turn(90);
r.move(90);
r.turn(90);
r.move(90);
r.turn(90);
r.hide();
	
}
static void drawTriangle() {
	Robot a = new Robot();
	a.setSpeed(90000);
	a.penDown();
	a.turn(120);
	a.move(100);
	a.turn(120);
	a.move(100);
	a.turn(120);
	a.move(100);
	a.hide();
}
static void drawCircle() {
	Robot s = new Robot();
	s.penDown();

	for(int i=0 ; i<360 ; i++ ) {
		s.setSpeed(9000);
		s.move(1);
		s.turn(1);
	}
	s.hide();
}
}
