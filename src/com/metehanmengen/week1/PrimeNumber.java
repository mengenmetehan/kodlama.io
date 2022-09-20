package com.metehanmengen.week1;

import java.util.Scanner;

public class PrimeNumber {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        while (true) {
            int value = Integer.parseInt(kb.nextLine());

            if(value == 0) {
                System.out.println("Input 0");
                return;
            }
            isPrime(value);
        }

    }

    public static boolean isPrime(int value)
    {
        if (value == 2)
            return value == 2;

        if (value == 3)
            return value == 3;

        if (value == 5)
            return value == 5;

        if (value == 7)
            return value == 7;

        for (int i = 11 ; i * i < value; i += 2)
            if (value % i == 0)
                return false;

        return true;
    }



}
