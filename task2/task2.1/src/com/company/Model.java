package com.company;

import java.util.ArrayList;

/**
 * Created by zxcubika on 26.06.2021.
 */
public class Model {

    public enum Result {
        TooBig,
        TooSmall,
        Error,
        Correct
    }

    private int randomNumber;
    private int lowLimit = GlobalConstants.PRIMARY_MIN_BARRIER;
    private int highLimit = GlobalConstants.PRIMARY_MAX_BARRIER;
    private ArrayList<Integer> userAttempts = new ArrayList<>();

    public Model() {
        this.randomNumber = randomNumber(0, 100);
    }

    // The Program logic

    /**
     * in this method check user's number
     * @param number
     * @return checkUserNumber
     */
    public Result checkUserNumber(int number) {
        userAttempts.add(number);
        if (number == -1) return Result.Error;
        if (this.randomNumber < number) {
            this.highLimit = number;
            return Result.TooBig;
        }
        if (this.randomNumber > number) {
            this.lowLimit = number;
            return Result.TooSmall;
        }
        return Result.Correct;
    }

    /**
     * in this method generate random number
     * @return randomNumber
     */
    public int randomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public int getLowLimit() {
        return lowLimit;
    }

    public int getHighLimit() {
        return highLimit;
    }

    public ArrayList<Integer> getUserAttempts() {
        return userAttempts;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

}
