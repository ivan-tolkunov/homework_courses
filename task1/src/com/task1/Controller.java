package com.task1;

import java.util.Scanner;

/**
 * Created by zxcubika on 26.06.2021.
 */
public class Controller {
    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }
    // The Work method
    public void processUser(){

        model.setSentence(inputWordWithScanner());
        model.uniteWords(inputWordWithScanner());

        view.printResult(model.getSentence());
    }

    // The Utility methods
    public String inputWordWithScanner() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            view.printMessage(View.INPUT_FIRST_WORD_DATA);
            String word = sc.nextLine();
            if (word.equals("Hello") || word.equals("world!")) return word;
            else view.printMessage(View.WRONG_INPUT_WORD_DATA);
        }
    }
}
