package com.throwExample;

public class AppNotRight {
    public static void main(String[] args) {
//        throw new String("Hello!");
//        throw null;
//        Error ref = new Error(); // создаем экземпляр
//        throw ref;               // "бросаем" его
//        f(null);
    }

    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
    }
}
