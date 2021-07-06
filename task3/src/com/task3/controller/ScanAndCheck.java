package com.task3.controller;

import com.task3.view.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScanAndCheck {
    View view;
    Scanner sc;

    public ScanAndCheck(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    /**
     * Returns a String in correct form.
     * The user's input must be in normal form.
     *
     * @param message an message to a user
     * @param regex   filter for input text
     * @return correct text
     * @see String
     */
    public String scanAndCheck(String message, String regex) {
        view.printStringInput(message);
        String input;
        while (true) {
            input = sc.nextLine();
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(input);
            if (m.matches())
                return input;
            view.printWrongStringInput(message);
        }
    }
}
