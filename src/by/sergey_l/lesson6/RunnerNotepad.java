package by.sergey_l.lesson6;

import java.time.LocalDate;

public class RunnerNotepad {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.addNote(LocalDate.now());
        notepad.addNote(LocalDate.now().plusDays(1));
        Notepad.Note[] notes = notepad.getNotes();
        for (Notepad.Note element: notes) {
            System.out.println(element.toString());
        }
    }
}
