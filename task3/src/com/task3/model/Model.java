package com.task3.model;

import com.task3.controller.Notebook;

import java.util.ArrayList;

public class Model {

    ArrayList<Notebook> notebooks = new ArrayList<>();

    public void addToNotebookNewPerson(Notebook person) {
        notebooks.add(person);
    }
}
