package com.task3.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.task3.view.TextConstant.INPUT_STRING_DATA;
import static com.task3.view.TextConstant.WRONG_INPUT_DATA;

public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
//    public static final ResourceBundle bundle =
//            ResourceBundle.getBundle(
//                    MESSAGES_BUNDLE_NAME); // English
        public static final ResourceBundle bundle =
                ResourceBundle.getBundle(
                        MESSAGES_BUNDLE_NAME,
                        new Locale("ukr", "Ukrainian"));  // Ukrainian

    //Utilities methods

    /**
     *
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }
    /**
     *
     * @param message
     * @return
     */
    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }
}
