package conversions;
import java.util.*;

public class baseConvert {
	public static void fromDecimal(int decimal, double base){
		System.out.println("Decimal: " + decimal);
		System.out.println("Base: " + base);
		int value;
		String output = "";
		double power;
		int number;
		value = decimal;
		power = 0;
		while(Math.pow(base,power) <= decimal){
			power += 1;
		}
		power -= 1;
		double powerSave = power;
		System.out.println("Maximum Power:" + power);
		for(int x = 0; x <= powerSave; x++){
			System.out.println("Loop");
			number = 0;
			while(value >= Math.pow(base,power)){
				value -= Math.pow(base,power);
				number += 1;
			}
			System.out.println(number);
			output = output + number;
			power -= 1;
		}
		System.out.println("Final Answer: " + output);
	}
	public static int toDecimal(String inputString, double base){
		System.out.println("Input: " + inputString);
		int output = 0;
		double power = inputString.length()-1;
		for(int placement = 0; placement < inputString.length(); placement++){
			output += Math.pow(base,power)*letterConvert.fromLetters(inputString.charAt(placement));
			System.out.println("Working output: " + output);
			System.out.println("Working power: " + power);
			System.out.println("Working base part: " + Math.pow(base,power));
			System.out.println("Working math: " + Math.pow(base,power)*inputString.charAt(placement));
			System.out.println("Working char: " + inputString.charAt(placement));
			power -= 1;
		}
		System.out.println("Output:" + output);
		return output;
	}
}