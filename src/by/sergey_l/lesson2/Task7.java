package by.sergey_l.lesson2;

/*
В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */
public class Task7 {
    public static void main(String[] args) {
        int countProgrammers = 0;
        String s1 = " программист";
        String s2 = " программиста";
        String s3 = " программистов";
        for (countProgrammers = 0; countProgrammers <= 30; countProgrammers++) {
            switch (countProgrammers % 10) {
                case 1: {
                    if (countProgrammers % 100 == 11) {
                        System.out.println(countProgrammers + s3);
                    } else {
                        System.out.println(countProgrammers + s1);
                    }
                    break;
                }
                case 2:
                case 3:
                case 4: {
                    if ((countProgrammers % 100 == 12) || (countProgrammers % 100 == 13) ||
                            (countProgrammers % 100 == 13) || (countProgrammers % 100 == 14)) {
                        System.out.println(countProgrammers + s3);
                    } else {
                        System.out.println(countProgrammers + s2);
                    }
                    break;
                }
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0: {
                    System.out.println(countProgrammers + s3);
                    break;
                }
            }
        }
    }
}
