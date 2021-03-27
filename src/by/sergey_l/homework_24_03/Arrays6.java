package by.sergey_l.homework_24_03;

/*
Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью.
*/

public class Arrays6 {
	
	public static void main(String[] args) {
		final int SIZE = 4;
		int[] array = new int[SIZE];
		boolean isGrowing = true;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 11);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] >= array[i+1]) {
				isGrowing = false;
				break;
			}
		}

		if (isGrowing) {
			System.out.println("Массив строго возрастающий");
		} else {
			System.out.println("Массив не является строго возрастающим");
		}

// доп задание:
//Проверить, различны ли все элементы массива.
		boolean allDifferents = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					allDifferents = false;
					break;
				}
			}
			if (!allDifferents) {
				break;
			}
		}
		if (allDifferents) {
			System.out.println("Все элементы массива различны");
		} else {
			System.out.println("Не все элементы массива различны");
		}
	}
}