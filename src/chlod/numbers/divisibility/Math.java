package chlod.numbers.divisibility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Math {

	public static final String version = "v0.1";
	public static final int versioncode = 1;
	
	public static void main(String[] args) {
		String module = null;
		do {
			output("Math Center " + version + " by Chlod Aidan B. Alejandro");
			output("");
			output("Please select module to use:");
			output("[A] Divisibility Module");
			//output("[B] Prime Number Finder Module");
			//output("[C] Odd-Even Number Finder Module");
			output("[X] Exit");
			output("");
			output("Module (A, X): ");
			Scanner input = new Scanner(System.in);
			module = input.nextLine().toUpperCase();
			input.close();
		} while (module == "A" || module == "X");
		switch(module) {
			case "A":
				divisibility();
				break;
			/**case "B":
				primefinder();
				break;
			case "C":
				oddevenfinder();
				break;
			case "X":
				exit();
				break;**/
		}
	}
	
	public static void divisibility() {
		output("Please enter the starting digit (default: 0): ");
		Scanner input = new Scanner(System.in);
		String starting = input.nextLine();
		
		output("Please enter the ending digit (default: " + Double.MAX_VALUE + "): ");
		String ending = input.nextLine();
		long start;
		long end;
		if (starting == "") start = 0;
		else start = Long.parseLong(starting);
		if (ending == "") end = 0;
		else end = Long.parseLong(ending);
		String[] pass = new String[2];
		pass[0] = Long.toString(start); pass[1] = Long.toString(end);
		Divisibility.divisibility(pass);
		input.close();
	}
	
	/*public static void primefinder() {
		output("Please enter the starting digit (default: 0): ");
		Scanner input = new Scanner(System.in);
		String starting = input.nextLine();
		long start;
		if (starting == "") start = 0;
		else start = Long.parseLong(starting);
		String pass;
		pass = Long.toString(start);
		//PrimeFinder.divisibility(pass);
		input.close();
	}*/
	
	public static void output(String s) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("[" + dateFormat.format(date) + "] " + s);
	}
}
