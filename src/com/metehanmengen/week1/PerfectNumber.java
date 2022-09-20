package com.metehanmengen.week1;

import java.util.Scanner;

public class PerfectNumber {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("Sayı giriniz :");
            int value = Integer.parseInt(kb.nextLine());

            if (value == 0)
                return;

            System.out.printf("%d sayısı mükemmel midir ? %b %n", value, isPerfect(value));
        }
    }

    public static boolean isPerfect (int a)
    {
        int sum = 0;

        for (int i = 1; i <= a / 2; i++)
        {
            if (a % i == 0)
                sum += i;
        }

        return a == sum;
    }
}
