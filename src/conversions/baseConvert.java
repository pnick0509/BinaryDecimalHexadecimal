package conversions;
import java.util.*;

public class baseConvert {
	public static void fromDecimal(int decimal, double base){
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
		for(int x = 0; x <= powerSave; x++){
			number = 0;
			while(value >= Math.pow(base,power)){
				value -= Math.pow(base,power);
				number += 1;
			}
			output = output + letterConvert.toLetters(number);
			power -= 1;
		}
		System.out.println("Final Answer: " + output);
	}
	public static int toDecimal(String inputString, double base){
		int output = 0;
		double power = inputString.length()-1;
		for(int placement = 0; placement < inputString.length(); placement++){
			output += Math.pow(base,power)*letterConvert.fromLetters(inputString.charAt(placement), base);
			power -= 1;
		}
		return output;
	}
}
