package conversions;

import java.util.Scanner;

public class main {
	public static void main(String[] args){
		double initialBase;
		double finalBase;
		String inputString;
		Scanner input = new Scanner(System.in);
		System.out.println("enter initial base:");
		initialBase = input.nextDouble();
		if(initialBase < 2){
			messages.smallInput();
		}
		if(initialBase > 16){
			messages.largeInput();
		}
		System.out.println("enter final base:");
		finalBase = input.nextDouble();
		if(initialBase < 2){
			messages.smallInput();
		}
		if(initialBase > 16){
			messages.largeInput();
		}
		System.out.println("enter number:");
		inputString = input.next();
		input.close();
		baseConvert.fromDecimal(baseConvert.toDecimal(inputString,initialBase),finalBase);
	}
}
