package com.metehanmengen.week1;

import java.util.Scanner;

public class LowAndHighVowels {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("Türkçe kelime giriniz :");
            String str = kb.nextLine();

            if (str.equals("elma"))
                return;

            char ch = str.toLowerCase().charAt(0);

            switch (ch) {
                case 'e', 'i', 'ö', 'ü' -> System.out.println("High Vowel - İnce sesli Harf");
                case 'a', 'ı', 'o', 'u' -> System.out.println("Low Vowel - Kalın sesli Harf");
                default -> System.out.println("Lütfen türkçe kelime giriniz : ");
        }
        }




    }
}
