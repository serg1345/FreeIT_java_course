package by.sergey_l.homework_24_03;

/*
Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
по очереди вводят координаты клетки в которую хотят сделать ход. После
каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
Игра продолжается до победы одного из игроков или ничьи.
 */

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] gameField = new char[3][3];
        boolean gameOver = false;
        int countStep = 0;
        String gamer1 = "Крест";
        String gamer2 = "Бублик";
        String gamer;
        char label;
        int[] step = new int[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < gameField.length; i++) {//заполняем игровое поле
            for (int j = 0; j < gameField[i].length; j++) {
                gameField[i][j] = '-';
            }
        }
        for (int i = 0; i < gameField.length; i++) {//выводим на экран игровое поле
            for (int j = 0; j < gameField[i].length; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
        do { // в этом цикле игроки делают ходы и мы эти ходы обрабатываем
            if (countStep % 2 == 0) {//выбираем игрока в зависимости от очередности хода
                gamer = gamer1;
                label = 'X';
            } else {
                gamer = gamer2;
                label = 'O';
            }
            System.out.println(gamer + ", сделайте свой ход:");
            for (int i = 0; i < step.length; i++) { //в массив step ложим введенные игроком номера строки и столбца
                boolean stepDone = false;
                if (i == 0) {
                    System.out.print("строка >> ");
                } else {
                    System.out.print("столбец >> ");
                }
                while (!stepDone) { //этим условием ждем корректного ввода от игрока
                    while (sc.hasNextInt() == false) {
                        System.out.print("Ваш ввод не корректен, повторите >> ");
                        sc.next();
                    }
                    step[i] = sc.nextInt();
                    if ((step[i] >= 1) && (step[i] <= 3)) {
                        stepDone = true;
                    } else {
                        System.out.print("Ваш ввод не корректен, повторите >> ");
                    }
                }
            }
            if (gameField[step[0] - 1][step[1] - 1] == '-') { //проверяем свободна ли выбранная игроком клетка
                gameField[step[0] - 1][step[1] - 1] = label;
                countStep++;
                for (int i = 0; i < gameField.length; i++) { //выводим игровое поле
                    for (int j = 0; j < gameField[i].length; j++) {
                        System.out.print(gameField[i][j] + " ");
                    }
                    System.out.println();
                }
                // проверяем был ли ход выигрышным (до 5го хода выигрыш невозможен)
                if (countStep >= 5) {
                    for (int i = 0; i < gameField.length; i++) { //проверим выигрушную ситуацию по строкам
                        while(!gameOver) {
                            if (gameField[i][1] != label) { //если ячейка строки не помечена меткой только что ходившего игрока, то переходим к следующей
                                break;
                            }
                            if ((gameField[i][0]==gameField[i][1]) && (gameField[i][2]==gameField[i][1])) { //если все ячейки в строке с меткой текущего игрока, то выигрыш
                                System.out.println(gamer + "! Поздравляем с выигрышем!!!");
                                gameOver = true;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    for (int j = 0; j < gameField.length; j++) { //проверим выигрушную ситуацию по строкам
                        while(!gameOver) {
                            if (gameField[1][j] != label) { //если ячейка столбца не помечена меткой только что ходившего игрока, то переходим к следующему
                                break;
                            }
                            if ((gameField[0][j]==gameField[1][j]) && (gameField[2][j]==gameField[1][j])) { //если все ячейки в столбце с меткой текущего игрока, то выигрыш
                                System.out.println(gamer + "! Поздравляем с выигрышем!!!");
                                gameOver = true;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    while(!gameOver) { // проверим выигрышную ситуацию по диагоналям
                        if (gameField[1][1] != label) { //если центр поля не помечен меткой ходившего игрока, то не выигныш, продолжаем
                            break;
                        }
                        if (((gameField[0][0]==gameField[1][1]) && (gameField[2][2]==gameField[1][1])) || //если все ячейки в диагонали с меткой текущего игрока, то выигрыш
                            ((gameField[0][2]==gameField[1][1]) && (gameField[2][0]==gameField[1][1])))    {
                            System.out.println(gamer + "! Поздравляем с выигрышем!!!");
                            gameOver = true;
                            break;
                        } else {
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Недопустимый ход, клетка уже занята");
            }
            if (countStep == 9) { //Если закончились ходы
                gameOver = true;
                System.out.println("НИЧЬЯ");
            }
        } while (!gameOver);
    }
}
