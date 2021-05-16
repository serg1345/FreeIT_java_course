package by.sergey_l.homework_24_03;

/*
Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 ... 7 5 3 1).
 */
public class Arrays2 {
    public static void main(String[] args) {
        int[] unevenArray = new int[50];
        for (int i = 0; i < unevenArray.length; i++) {
            unevenArray[i] = i * 2 + 1;
        }
        for (int i = 0; i < unevenArray.length; i++) {
            System.out.print(unevenArray[i] + " ");
        }
        System.out.println();

        for (int i = unevenArray.length - 1; i >= 0; i--) {
            System.out.print(unevenArray[i] + " ");
        }
        System.out.println();
// доп задание:
//Найти среднее арифметическое элементов с нечетными номерами.
        int countOddIndex = 0;
        int sumElementsOddIndex = 0;
        for (int i = 1; i < unevenArray.length; i += 2) {
            countOddIndex++;
            sumElementsOddIndex += unevenArray[i];
        }
        System.out.println("Среднее арифметическое элементов с нечетными индексами равно " + sumElementsOddIndex / (double) countOddIndex);
    }
}
