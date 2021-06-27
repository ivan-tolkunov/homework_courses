package com.company;

/**
 * Created by zxcubika on 26.06.2021.
 */
public class View {
    // Text's constants
    public static final String INPUT_FIRST_WORD_DATA = "Input sentence: ";
    public static final String WRONG_INPUT_WORD_DATA = "Wrong input!";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printResult(String sentence){
        System.out.println(sentence);
    }
}
