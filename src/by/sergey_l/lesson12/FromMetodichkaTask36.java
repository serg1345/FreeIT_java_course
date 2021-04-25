package by.sergey_l.lesson12;

import java.io.File;
import java.io.IOException;

/*
Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
должны быть распечатаны отдельно.
 */
public class FromMetodichkaTask36 {
    public static void main(String[] args) throws IOException {
        createStructure();
        File file = new File("C:\\Test");
        File[] list = file.listFiles();
        System.out.println("Список каталогов в выбранной папке: ");
        for (File elem : list) {
            if (elem.isDirectory()) {
                System.out.println(elem);
            }
        }
        System.out.println("Списой файлов в выбранной папке: ");
        for (File elem : list) {
            if (elem.isFile()) {
                System.out.println(elem);
            }
        }
        deleteFiles(file);
    }

    public static void deleteFiles(File file) {
        File[] list = file.listFiles();
        for (File elem : list) {
            if (elem.isFile()) {
                elem.delete();
            } else {
                deleteFiles(elem);
            }
        }
        file.delete();
    }

    public static void createStructure() throws IOException {
        File file = new File("C:\\Test");
        file.mkdir();
        file = new File("C:\\Test\\one");
        file.mkdir();
        file = new File("C:\\Test\\two");
        file.mkdir();
        file = new File("C:\\Test\\1.txt");
        file.createNewFile();
        file = new File("C:\\Test\\2.txt");
        file.createNewFile();
    }
}
