package by.sergey_l.lesson9;

public class RunnerForArrayAnyType {
    public static void main(String[] args) {
        String[] stringArray = new String[]{"Hello", "Bye", "shop"};
        ArrayAnyType<String> box = new ArrayAnyType<String>();
        box.setArray(stringArray);
        for (int i = 0; i < box.getLength(); i++) {
            System.out.println(box.getArrayIndex(i));
        }
        Integer[] intArray = new Integer[]{5, 8, 34};
        ArrayAnyType<Integer> box1 = new ArrayAnyType<Integer>();
        box1.setArray(intArray);
        for (int i = 0; i < box1.getLength(); i++) {
            System.out.println(box1.getArrayIndex(i));
        }
    }
}
