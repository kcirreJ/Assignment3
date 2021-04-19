package week2;

import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
import acm.program.GraphicsProgram;

public class DrawingLines extends GraphicsProgram {

	public void run() {
		
		addMouseListeners();		
	}
	
	public void mousePressed(MouseEvent me) {
		int x = me.getX();
		int y = me.getY();
		line = new GLine(x, y, x, y);
		add(line);
	}
	
	public void mouseDragged(MouseEvent me) {
		int x = me.getX();
		int y = me.getY();
		line.setEndPoint(x, y);
	}
	
	private GLine line;
	
}
