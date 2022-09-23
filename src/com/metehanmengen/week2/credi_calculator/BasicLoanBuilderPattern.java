package com.metehanmengen.week2.credi_calculator;

import java.time.LocalDate;

public class BasicLoanBuilderPattern {
    private String ID_No;
    private String name;
    private String lastName;
    private long loanAmount;
    private LoanType loanType;
    private LocalDate drawnDownDate; //kredi kullandırma tarihi

    private BasicLoanBuilderPattern(String ID_No, String name, String lastName, long loanAmount, LoanType loanType, LocalDate dueDate) {
        this.ID_No = ID_No;
        this.name = name;
        this.lastName = lastName;
        this.loanAmount = loanAmount;
        this.loanType = loanType;
        this.drawnDownDate = dueDate;
    }

    public BasicLoanBuilderPattern()
    {

    }

    enum LoanType {PERSONAL, MORTGAGE, AGRICULTURAL, TEACHER, FLEX,}

    public static class Builder
    {
        private final BasicLoanBuilderPattern basicLoan;
        public Builder() {
            basicLoan = new BasicLoanBuilderPattern("", "", "", 30_000, LoanType.FLEX, LocalDate.of(2032, 11, 29));
        }

        public Builder setID_No(String id)
        {
            basicLoan.ID_No = id;
            return this;
        }

        public Builder setName(String name)
        {
            basicLoan.name = name;
            return this;
        }

        public Builder setLastName(String lastName)
        {
            basicLoan.lastName = lastName;
            return this;
        }

        public Builder setLoanAmount(long amount)
        {
            basicLoan.loanAmount = amount;
            return this;
        }

        public Builder setdueDate(int year, int mount, int day)
        {
            basicLoan.drawnDownDate = LocalDate.of(year, mount, day);
            return this;
        }

        public BasicLoanBuilderPattern build()
        {
            return basicLoan;
        }


    }




}
