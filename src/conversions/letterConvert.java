package conversions;

public class letterConvert {
	public static char toLetters(int num){
		if(num == 0){
			return '0';
		}
		if(num == 1){
			return '1';
		}
		if(num == 2){
			return '2';
		}
		if(num == 3){
			return '3';
		}
		if(num == 4){
			return '4';
		}
		if(num == 5){
			return '5';
		}
		if(num == 6){
			return '6';
		}
		if(num == 7){
			return '7';
		}
		if(num == 8){
			return '8';
		}
		if(num == 9){
			return '9';
		}
		if(num == 10){
			return 'A';
		}
		if(num == 11){
			return 'B';
		}
		if(num == 12){
			return 'C';
		}
		if(num == 13){
			return 'D';
		}
		if(num == 14){
			return 'E';
		}
		if(num == 15){
			return 'F';
		}
		messages.invalidInput();
		return '0';
	}
	public static int fromLetters(char letter, double base){
		int indexedNumber = letterConvert.numberTable(letter);
		if(indexedNumber >= base){
			messages.invalidInput();
		}
		return indexedNumber;
	}
	public static int numberTable(char letter){
		if(letter == '0'){
			return 0;
		}
		if(letter == '1'){
			return 1;
		}
		if(letter == '2'){
			return 2;
		}
		if(letter == '3'){
			return 3;
		}
		if(letter == '4'){
			return 4;
		}
		if(letter == '5'){
			return 5;
		}
		if(letter == '6'){
			return 6;
		}
		if(letter == '7'){
			return 7;
		}
		if(letter == '8'){
			return 8;
		}
		if(letter == '9'){
			return 9;
		}
		if(letter == 'A'){
			return 10;
		}
		if(letter == 'B'){
			return 11;
		}
		if(letter == 'C'){
			return 12;
		}
		if(letter == 'D'){
			return 13;
		}
		if(letter == 'E'){
			return 14;
		}
		if(letter == 'F'){
			return 15;
		}
		messages.invalidInput();
		return 0;
	}
}
