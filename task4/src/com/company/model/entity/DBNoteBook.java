package com.company.model.entity;

import java.util.ArrayList;

public class DBNoteBook {
    ArrayList<NoteBook> noteBooks = new ArrayList<>();


    public DBNoteBook() {
        this.noteBooks.add(new NoteBook("Тарас", "taras12345"));
        this.noteBooks.add(new NoteBook("Иван", "ivan12345"));
        this.noteBooks.add(new NoteBook("Андрей", "andrey12345"));
    }

    public void addNewNoteBook(NoteBook noteBook) throws NotUniqueLoginException {
        for (NoteBook book : this.noteBooks) {
            if (book.login.equals(noteBook.login)) {
                throw new NotUniqueLoginException("This login is taken " + noteBook.login);
            }
        }
        this.noteBooks.add(noteBook);
    }
}
