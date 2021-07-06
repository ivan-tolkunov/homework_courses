package com.task1;

/**
 * Created by zxcubika on 26.06.2021.
 */
public class Model {
    private String sentence;

    // The Program logic

    /**
     * in this method add valueInt with this.value
     * @param word
     * @return unitSentence
     */
    public String uniteWords(String word){
        return sentence += " " + word;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
