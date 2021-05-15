package by.sergey_l.lesson6;

/*
Создать класс Notepad с внутренним классом или классами, с помощью объек-
тов которого могут храниться несколько записей на одну дату.
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class Notepad {
    private ArrayList<Note> notes = new ArrayList<Note>();

    protected class Note {
        private LocalDate date;
        private ArrayList<String> records = new ArrayList<String>();

        public Note(LocalDate date) {
            this.date = date;
            addRecord();
        }
        private void addRecord() {
            records.add("первый");
            records.add("второй");
        }
        @Override
        public String toString() {
            String str = "На " + date + " имеется " + records.size() + " записи: \n";
            for (String element: records) {
                str += element + "\n";
            }
            return str;
        }
    }

    public void addNote(LocalDate date) {
        notes.add(new Note(date));
    }
    public Note[] getNotes() {
        return notes.toArray(new Note[notes.size()]);
    }
}
