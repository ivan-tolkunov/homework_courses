package com.company;

import java.util.ArrayList;

/**
 * Created by zxcubika on 26.06.2021.
 */
public class View {
    // Text's constants
    final String ENTERING_MESSAGE = "Enter number(";
    final String ERROR_TYPE = "Uh oh! Your input is not the correct!";
    final String BIGGER_NUMBER = "Number > ";
    final String SMALLER_NUMBER = "Number < ";
    final String WIN_MESSAGE = "Yes! My number is ";

    public void message(String message) {
        System.out.println(message);
    }

    public void messageRange(int min, int max) {
        message(ENTERING_MESSAGE + min + "-" + max + "):");
    }

    public void tipMessage(String message, int number) {
        message(message + number);
    }

    public void winMessage(int number) {
        message(WIN_MESSAGE + number);
    }

    public void arrayShow(ArrayList<Integer> array) {
        System.out.println("All your attempts:");
        System.out.print("|");
        for (int i : array) {
            if(i != -1 && i != 0) System.out.print(i + "|");
        }
    }
}