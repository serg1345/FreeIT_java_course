package by.sergey_l.lesson1;

public class Task4 {
/*
Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.
*/

	public static void main(String[] args) {
		int number = 1234;
		
		int fourDigit = number / 1000;
		int threeDigit = (number % 1000) / 100;
		int twoDigit = (number % 100) / 10;
		int oneDigit = number % 10;
		int reverseNumber = oneDigit * 1000 + twoDigit * 100 + threeDigit * 10 + fourDigit;
		
		System.out.printf("начальное число: %d \nрезультат: \t %d", number, reverseNumber);
	}
	
}