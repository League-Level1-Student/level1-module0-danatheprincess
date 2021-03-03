package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob=new Robot();
	Random ran=new Random();
	public void run() {
			
			rob.setWindowSize(650, 400);
			rob.miniaturize();
			rob.setX(40);
			rob.setY(375);
			rob.setSpeed(10);
			rob.penDown();
			for(int i=0;i<9;i++) {
				int number=ran.nextInt(3);
				if(number==0) {
					drawHouse("small",Color.BLUE);
				}else if(number==1) {
					drawHouse("medium",Color.red);
				}else {
					drawHouse("large",Color.cyan);
				}
				
			}
	}
	void drawHouse(int height,Color color) {
		rob.setPenColor(color);
		rob.setAngle(0);
		rob.move(height);
		if(height<250) {
			drawPointyRoof();
		}else
			drawFlatRoof();
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(Color.GREEN);
		rob.move(15);
		
	}
	void drawHouse(String height,Color color) {
		if(height.equals("small")){
			drawHouse(60,color);
		}else if(height.equals("medium")) {
			drawHouse(120,color);
		}else
			drawHouse(250,color);
	}
	void drawPointyRoof() {
		rob.turn(45);
		rob.move(25);
		rob.turn(90);
		rob.move(25);
		rob.turn(45);
	}
	void drawFlatRoof() {
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
	}
}
