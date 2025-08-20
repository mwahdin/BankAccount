package com.mwahdin;

import com.mwahdin.bamkbalance.BankAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("mahdi", "Rahimzadehm65@gmail.com", "09395582443", 5_000_000);
        bankAccount.withdraw(500_000);
        bankAccount.deposit(5400000);
        System.out.println(bankAccount.getAccountNumber());
    }


}