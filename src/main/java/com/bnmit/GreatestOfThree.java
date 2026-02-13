package com.bnmit;

public class GreatestOfThree {

    public static int findGreatest(int a, int b, int c) {
        int greatest = a;

        if (b > greatest) {
            greatest = b;
        }

        if (c > greatest) {
            greatest = c;
        }

        return greatest;
    }

    public static void main(String[] args) {
        System.out.println(findGreatest(10, 20, 30));
    }
}
