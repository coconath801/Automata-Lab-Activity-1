package vadil;

import java.util.Scanner;


public class act1 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a binary string:");
		String str = scan.nextLine();
		
		
		
		String state = "q0";
	for (int i = 0;  i < str.length(); i++) {
		char symbol =str.charAt(i);
		
		switch (state) {
	    case "q0":
	        if (symbol == '0')
	            state = "q1";
	        else if (symbol == '1')
	            state = "q0";
	        break;

	    case "q1":
	        if (symbol == '0')
	            state = "q1";
	        else if (symbol == '1')
	            state = "q2";
	        break;

	    case "q2":
	        if (symbol == '0')
	            state = "q1";
	        else if (symbol == '1')
	            state = "q0";
	        break;
	}
		if (state.equals("q2"))
		    System.out.println("Output: Accepted");
		else
		    System.out.println("Output: Rejected");
		}
	
	}
	

	

}
