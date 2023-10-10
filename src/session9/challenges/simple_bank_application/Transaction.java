package session9.challenges.simple_bank_application;

import java.util.Date;

public class Transaction {

    private Date time;
    private String typeOfTransaction;
    private double amount;

    public Transaction(String typeOfTransaction,double amount) {
        this.time = new Date();
        this.typeOfTransaction = typeOfTransaction;
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public String getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public double getAmount() {
        return amount;
    }
    
}
