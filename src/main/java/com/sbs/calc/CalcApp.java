package com.sbs.calc;

public class CalcApp {

    public static int run(String exp) {

        String[] bits = exp.split("\\+");

        int a = Integer.parseInt(bits[0]), b = Integer.parseInt(bits[1]);

        return a + b;
    }
}
