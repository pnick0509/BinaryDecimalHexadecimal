package conversions;

public class letterConvert {
	public static char toLetters(int num){
		if(num > 9){
			return '1';
		}else{
			return '2';
		}
	}
	public static int fromLetters(char letter){
		if(letter == '0'){
			return 0;
		}
		if(letter == '1'){
			return 1;
		}
		if(letter == '2'){
			
			return 2;
		}
		messages.invalidInput();
		return 0;
	}
}
