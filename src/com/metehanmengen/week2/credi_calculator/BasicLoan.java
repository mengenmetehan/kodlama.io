package com.metehanmengen.week2.credi_calculator;

import java.time.LocalDate;

public abstract class BasicLoan {
    protected String ID_No;
    protected String name;
    protected String lastName;
    protected long loanAmount;
    protected LoanType loanType;
    protected double bankRate; // kredi türüne göre değişecek
    protected LocalDate drawnDownDate; //kredi kullandırma tarihi

    enum LoanType {PERSONAL, MORTGAGE, AGRICULTURAL, TEACHER, FLEX,}

    protected BasicLoan(String ID_No, String name, String lastName, long loanAmount, LoanType loanType, LocalDate dueDate) {
        this.ID_No = ID_No;
        this.name = name;
        this.lastName = lastName;
        this.loanAmount = loanAmount;
        this.loanType = loanType;
        this.drawnDownDate = dueDate;
    }

    protected BasicLoan ()
    {
        this("", "", "", 0, LoanType.FLEX, LocalDate.of(2035, 1, 1));
    }

    protected BasicLoan(int year, int month, int day)
    {
        this("", "", "", 0, LoanType.FLEX, LocalDate.of(year, month, day));
    }

    public String getID_No() {
        return ID_No;
    }

    public void setID_No(String ID_No) {
        this.ID_No = ID_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public LocalDate getDrawnDownDate() {
        return drawnDownDate;
    }

    public void setDrawnDownDate(LocalDate drawnDownDate) {
        this.drawnDownDate = drawnDownDate;
    }

    public double getBankRate()
    {
        switch (loanType)
        {
            case PERSONAL -> bankRate = 1.29;
            case MORTGAGE -> bankRate = 2.35;
            case AGRICULTURAL -> bankRate = 2.45;
            case TEACHER -> bankRate = 2.49;
            case FLEX -> bankRate = 2.99;
        }
        return bankRate;

    }

    public abstract boolean isValid();

    public abstract int totalPaymentAmount();

    public abstract int monthlyPaymentAmount();

}
