package com.company;

import java.util.Scanner;

public class Ruut {

    public static void main(String[] args)  {


        Scanner input = new Scanner(System.in);
        System.out.println("sisesta raadius:");
        double r = input.nextDouble();
        double a;
        a = 2*r;

        System.out.printf("Ruudu pindala on %.2f%n", RuuduS(a));
        System.out.printf("Ruudu ümbermõõt on %.2f%n", RuuduP(a));
        System.out.printf("Ringi pindala on ligikaudu %.2f%n", RingiS(r));
        System.out.printf("Ringi ümbermõõt on ligikaudu %.2f%n", RingiP(r));
    }

    public static double RuuduS (double a){

        return Math.pow(a, 2);
    }

    public static double RuuduP (double a){

        return 4*a;
    }

    public static double RingiS (double r){

        return Math.PI * Math.pow(r, 2);
    }

    public static double RingiP (double r){

        return 2 * Math.PI * r;
    }


}
