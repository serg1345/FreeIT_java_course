package by.sergey_l.lesson1;

public class Task5 {
/*
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
*/

	public static void main(String[] args) {
		
//		int number = 1234;
		int number = (int) (Math.random()*9000) + 1000; //генерим случайное четырехзначное число

		int fourDigit = number / 1000;
		int threeDigit = (number % 1000) / 100;
		int twoDigit = (number % 100) / 10;
		int oneDigit = number % 10;
		
		if ((oneDigit == twoDigit) || (oneDigit == threeDigit) || (oneDigit == fourDigit) || (twoDigit == threeDigit) 
		|| (twoDigit == fourDigit) || (threeDigit == fourDigit)) {
			System.out.printf("Неверно что у числа %d все цифры различны", number);
		} else {
			System.out.printf("Верно что у числа %d все цифры различны", number);	
		}
		
	}
	
}