package by.sergey_l.homework_24_03;

/*

Создать двухмерный квадратный массив, и заполнить его «бабочкой»,
 */
public class FromMetodichkaTask17 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[][] array = new int[SIZE][SIZE];
        for (int i = 0; i < array.length; i++) {
            if (i < SIZE / 2) { //цикл для верхней половины матрицы
                for (int j = i; j < array[i].length - i; j++) {
                    array[i][j] = 1;
                }
            } else { //цикл для нижней половины матрицы
                for (int j = SIZE - 1 - i; j <= i; j++) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
