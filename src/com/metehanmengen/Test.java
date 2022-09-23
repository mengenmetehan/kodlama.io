package com.metehanmengen;


import com.metehanmengen.week1.FindingNumber;
import com.metehanmengen.week2.credi_calculator.AgriculturalLoan;

public class Test {

    public static void main(String[] args) {

        AgriculturalLoan loan1 = new AgriculturalLoan("123456", "Mete Han", "Mengen", 500_000, 120, 2022, 11, 25);

        System.out.println(loan1.isValid());
        System.out.println(loan1.getID_No());
        System.out.println(loan1.getBankRate());
        System.out.println("Aylık ödeme " + loan1.monthlyPaymentAmount());
        System.out.println("Toplam ödeme " + loan1.totalPaymentAmount());
    }
}
