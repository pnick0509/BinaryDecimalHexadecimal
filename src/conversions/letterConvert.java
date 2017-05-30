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
		if(num == 16){
			return 'G';
		}
		if(num == 17){
			return 'H';
		}
		if(num == 18){
			return 'I';
		}
		if(num == 19){
			return 'J';
		}
		if(num == 20){
			return 'K';
		}
		if(num == 21){
			return 'L';
		}
		if(num == 22){
			return 'M';
		}
		if(num == 23){
			return 'N';
		}
		if(num == 24){
			return 'O';
		}
		if(num == 25){
			return 'P';
		}
		if(num == 26){
			return 'Q';
		}
		if(num == 27){
			return 'R';
		}
		if(num == 28){
			return 'S';
		}
		if(num == 29){
			return 'T';
		}
		if(num == 30){
			return 'U';
		}
		if(num == 31){
			return 'V';
		}
		if(num == 32){
			return 'W';
		}
		if(num == 33){
			return 'X';
		}
		if(num == 34){
			return 'Y';
		}
		if(num == 35){
			return 'Z';
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
		if(letter == 'G'){
			return 16;
		}
		if(letter == 'H'){
			return 17;
		}
		if(letter == 'I'){
			return 18;
		}
		if(letter == 'J'){
			return 19;
		}
		if(letter == 'K'){
			return 20;
		}
		if(letter == 'L'){
			return 21;
		}
		if(letter == 'M'){
			return 22;
		}
		if(letter == 'N'){
			return 23;
		}
		if(letter == 'O'){
			return 24;
		}
		if(letter == 'P'){
			return 25;
		}
		if(letter == 'Q'){
			return 26;
		}
		if(letter == 'R'){
			return 27;
		}
		if(letter == 'S'){
			return 28;
		}
		if(letter == 'T'){
			return 29;
		}
		if(letter == 'U'){
			return 30;
		}
		if(letter == 'V'){
			return 31;
		}
		if(letter == 'W'){
			return 32;
		}
		if(letter == 'X'){
			return 33;
		}
		if(letter == 'Y'){
			return 34;
		}
		if(letter == 'Z'){
			return 35;
		}
		messages.invalidInput();
		return 0;
	}
}
