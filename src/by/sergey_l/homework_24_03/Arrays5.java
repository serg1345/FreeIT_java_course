package by.sergey_l.homework_24_03;

/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).
*/

public class Arrays5 {
	
	public static void main(String[] args) {
		final int SIZE = 5;
		int[] array1 = new int[SIZE];
		int[] array2 = new int[SIZE];
		int sum1 = 0;
		double average1;
		int sum2 = 0;
		double average2;
		
		for (int i = 0; i < SIZE; i++) {
			array1[i] = (int) (Math.random() * 16);
			sum1 += array1[i];
			array2[i] = (int) (Math.random() * 16);
			sum2 += array2[i];
		}
		average1 =(double) sum1 / SIZE;
		average2 =(double) sum2 / SIZE;
		
		for (int i = 0; i < SIZE; i++) {
			System.out.print(array1[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < SIZE; i++) {
			System.out.print(array2[i] + "\t");
		}
		System.out.println();
		if (average1 == average2) {
			System.out.printf("Средние арифметические первого массива %.3f равно среднему арифметическому второго массива %.3f\n", average1, average2);
		} else if (average1 > average2) {
			System.out.printf("Средние арифметические первого массива %.3f больше среднего арифметического второго массива %.3f\n", average1, average2);
		} else {
			System.out.printf("Средние арифметические первого массива %.3f меньше среднего арифметического второго массива %.3f\n", average1, average2);
		}

// доп задание:
//«Сожмите» массив, выбросив из него каждый второй элемент.
//«Освободившиеся» места массива заполните нулями.
		for (int i = 1; i < array2.length; i++) {
			if (i > (array2.length - 1) / 2) {
				array2[i] = 0;
			} else {
				array2[i] = array2[i * 2];
			}
		}
		for (int i = 0; i < SIZE; i++) {
			System.out.print(array2[i] + "\t");
		}
		System.out.println();
	}
}