package com.metehanmengen.week1;

import java.util.Scanner;

public class FriendNumber {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("Sayıları giriniz :");
            int number1 = Integer.parseInt(kb.nextLine());
            int number2 = Integer.parseInt(kb.nextLine());

            if (number1 == 0 || number2 == 0)
                return;

            if (isFriends(number1, number2))
                System.out.println("2 sayı arkadaştır");
            else
                System.out.println("2 sayı arkadaş değildir.");
        }
    }

    private static int perfectNumber (int a)
    {
        int sum = 0;

        for (int i = 1; i <= a / 2; i++)
        {
            if (a % i == 0)
                sum += i;
        }

        return sum;
    }

    private static boolean isFriends(int a, int b)
    {
        return a == perfectNumber(b) && b == perfectNumber(a);
    }
}
