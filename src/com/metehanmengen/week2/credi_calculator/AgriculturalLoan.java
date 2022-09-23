package com.metehanmengen.week2.credi_calculator;

import java.time.LocalDate;

public class AgriculturalLoan extends BasicLoan {
    LoanType loanType = LoanType.AGRICULTURAL;
    private final int period; //kredi kullanılacak ay süresi

    public AgriculturalLoan(String id, String name, String LastName, long amount, int period,  LocalDate date)
    {
        super(id, name, LastName, amount, LoanType.AGRICULTURAL, date);
        this.period = period;
    }

    public AgriculturalLoan(String id, String name, String LastName, long amount, int period, int year, int month, int day)
    {
        super(id, name, LastName, amount, LoanType.AGRICULTURAL, LocalDate.of(year, month, day));
        this.period = period;
    }

    @Override
    public boolean isValid() {
        final int maxLoan = 1_000_000;
        if (loanAmount >= maxLoan) {
            System.out.printf("Invalid loan amount - Loan can not be greater than %d", maxLoan);
            return false;
        }
        return true;
    }

    @Override
    public int totalPaymentAmount() {
        final int forDocumentsPayment = 10_000;
        double totalLoanAmount = (((loanAmount + forDocumentsPayment) / period) * bankRate) * period;
        return (int)totalLoanAmount;

    }

    @Override
    public int monthlyPaymentAmount() {
        return totalPaymentAmount() / period;
    }
}
