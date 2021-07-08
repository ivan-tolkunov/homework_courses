package com.company.controller;

import com.company.model.Model;
import com.company.model.entity.NotUniqueLoginException;
import com.company.view.View;

import java.util.Scanner;

/**
 * Created by zxcubika on 08.07.2021.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(view, sc);
        while (true) {
            try {
                model.addNewNoteBookInDB(inputNoteNoteBook.inputNote());
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
            }
        }
    }
}
