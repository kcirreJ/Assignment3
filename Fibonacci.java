package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static final int MAX_TERM_VALUE = 6765;
	
	
	
	public void run() {

		int term = 0;
		int lastTerm = 0;
		int nextTerm = 1;
	
		for (int term1 = 0; term1 < 1; term1++) {
			
			System.out.println(term1);
			
			
		}
			
		while (term < MAX_TERM_VALUE) {
			
			lastTerm = nextTerm;
			nextTerm = term;
			term = lastTerm + nextTerm;
			System.out.println(term);
			
			
		
		}
				
		
	}
}
