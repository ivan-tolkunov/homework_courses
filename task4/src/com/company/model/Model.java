package com.company.model;

import com.company.model.entity.DBNoteBook;
import com.company.model.entity.NotUniqueLoginException;
import com.company.model.entity.NoteBook;

/**
 * Created by zxcubika on 08.07.2021.
 */
public class Model {

    DBNoteBook db;

    public Model(DBNoteBook db) {
        this.db = db;
    }

    public void addNewNoteBookInDB(NoteBook noteBook) throws NotUniqueLoginException {
        db.addNewNoteBook(noteBook);
    }
}
