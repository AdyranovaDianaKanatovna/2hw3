package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void deposit(double sum){
        amount += sum;
        System.out.println("you have put money in your account:" + getAmount() );
    }
    public void withDraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("you haven't enough money in your account",amount);
        }else {
            amount-=sum;
            System.out.println("you have taken your money from account:" + sum +
                    "you have this amount of money in account:" + amount);
        }
    }
}
