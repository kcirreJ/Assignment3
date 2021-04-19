package week2;

import java.awt.Color;
import java.text.spi.CollatorProvider;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {

	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	private static final int HEAD_WIDTH = 150;
	private static final int HEAD_HEIGHT = 250;
	private static final int EYE_RADIUS = 20;
	private static final int MOUTH_WIDTH = 75;
	private static final int MOUTH_HEIGHT = 25;
	public void run() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		robotMouth();
		robotHead();
		robotEye1();
	}
	private void robotHead() {
		double x = ((getWidth()/2) - (HEAD_WIDTH/2));
		double y = ((getHeight()/2) - (HEAD_HEIGHT/2));
		GRect head = new GRect(y, x);
		head.setColor(Color.BLACK);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
		
		}	
	
	private void robotEye1() {
		double x = getWidth()/2 - HEAD_WIDTH/4 - EYE_RADIUS;
		double y = getHeight()/2 - HEAD_HEIGHT/4 - EYE_RADIUS;
		GOval leftEye = new GOval (EYE_RADIUS, EYE_RADIUS);
		leftEye.setLocation(y, x);
		add(leftEye);
		}	
	
	private void robotMouth() {
		double x = getWidth()/2 - MOUTH_WIDTH/2;
		double y = getHeight()/2 + HEAD_HEIGHT/4 - MOUTH_HEIGHT/2;
		GRect mouth = new GRect(x, y);
		mouth.setColor(Color.WHITE);
		mouth.setFilled(true);
		add(mouth);
	}
	
}
