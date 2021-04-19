package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram {
	
	private RandomGenerator rng = RandomGenerator.getInstance();
	private static final int maxCircles = 10;
	private static final int minRadius = 1;
	private static final int maxRadius = 100;
		
	public void run() {

		for(int i=0; i < maxCircles; i++) {
			randomCircle();
		}

	}

	private void randomCircle() {
		int radius = rng.nextInt(minRadius, maxRadius);
		int x = rng.nextInt(0, getWidth() - radius);
        int y = rng.nextInt(0, getHeight() - radius);
        GOval circle = new GOval(x, y, radius, radius);
        circle.setColor(rng.nextColor());
        circle.setFilled(true);
        add(circle);
		
	}
}

