package conversions;

import java.util.Scanner;

public class main {
	public static void main(String[] args){
		double initialBase;
		double finalBase;
		String inputString;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter initial base:");
		initialBase = input.nextDouble();
		if(initialBase < 2){
			messages.smallInput();
		}
		if(initialBase > 36){
			messages.largeInput();
		}
		System.out.println("Enter final base:");
		finalBase = input.nextDouble();
		if(initialBase < 2){
			messages.smallInput();
		}
		if(initialBase > 36){
			messages.largeInput();
		}
		System.out.println("Enter number:");
		inputString = input.next();
		input.close();
		baseConvert.fromDecimal(baseConvert.toDecimal(inputString,initialBase),finalBase);
	}
}
