package com.company;

import java.util.Scanner;

public class Temperatuur {

    public static void main(String[] args) {

        Scanner temp = new Scanner(System.in);

        System.out.println("Insert current temperature: ");
        int temperature = temp.nextInt();
        evaluate(temperature);
    }

    public static void evaluate(int temperature) {
        if (temperature > 25) {
            System.out.println("Hot!");
        } else if (temperature < 10) {
            System.out.println("Cold!");
        } else System.out.println("Warm!");
    }
}
