package by.sergey_l.lesson9;

/*
Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.
 */
public class ArrayAnyType<T> {
    private T[] array;

    public T getArrayIndex(int i) {
        return array[i];
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int getLength() {
        return array.length;
    }
}
