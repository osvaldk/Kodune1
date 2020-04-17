package com.company;

import java.util.Scanner;

public class Palgatõus {

    public static void main(String[] args) {

        Scanner PalgadInput = new Scanner(System.in);

        System.out.println("Sisesta töötajate arv:");
        int workers = PalgadInput.nextInt();
        double arr[] = new double[workers];

        System.out.println("Sisesta palgad:");
        for (int palk = 0; palk < workers; palk++) {
            arr[palk] = PalgadInput.nextInt();
        }

        System.out.println("Uuendatud palgad on järgmised: ");
        PalgaMassiiv(arr);
    }

    public static void PalgaMassiiv(double [] arr) {
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] < 1000) {
               arr[i] = arr[i] * 1.05;
           } System.out.println(arr[i] + "€ ");
       }
    }
}
