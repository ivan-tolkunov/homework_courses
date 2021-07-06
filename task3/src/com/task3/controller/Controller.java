package com.task3.controller;

import com.task3.model.Model;
import com.task3.view.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The work method
    public void userProcess() {
        InputNote inputNote = new InputNote(view);
        inputNote.addNewPerson();
    }

}
