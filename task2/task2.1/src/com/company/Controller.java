package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by zxcubica on 26.06.2021.
 */
public class Controller {
    // Constructor
    View view;
    Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    // The Work method
    public void userProgress() {
        view.messageRange(model.getLowLimit(), model.getHighLimit());
        while (true) {
            int number = enterNumber();
            switch (model.checkUserNumber(number)) {
                case Error:
                    view.message(view.ERROR_TYPE);
                    view.messageRange(model.getLowLimit(), model.getHighLimit());
                    break;
                case TooBig:
                    view.tipMessage(view.SMALLER_NUMBER, number);
                    view.messageRange(model.getLowLimit(), model.getHighLimit());
                    break;
                case TooSmall:
                    view.tipMessage(view.BIGGER_NUMBER, number);
                    view.messageRange(model.getLowLimit(), model.getHighLimit());
                    break;
                case Correct:
                    view.winMessage(number);
                    view.arrayShow(model.getUserAttempts());
                    return;
            }
        }
    }

    // The Utility methods
    private int enterNumber() {
        Scanner sc = new Scanner(System.in);
        try {
            int number = sc.nextInt();
            if (number > model.getHighLimit() || number < model.getLowLimit()) {
                return -1;
            }
            return number;
        } catch (InputMismatchException inputMismatchException) {
            return -1;
        }
    }
}
