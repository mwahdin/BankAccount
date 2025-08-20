package com.mwahdin.bamkbalance;

public class BankAccount {
    private String customerName;
    private final String accountNumber;
    private String email;
    private String phoneNumber;
    private long accountBalance;

    public BankAccount(String customerName, String email, String phoneNumber, long accountBalance) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
        this.accountNumber = String.valueOf((long)(Math.random() * 9_000_000_000_000_0000L + 1_000_000_000_000_0000L));
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(long amount){
        if(amount <= 0) throw new RuntimeException("Deposit must be positive");
        this.accountBalance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + accountBalance);    }

    public void withdraw(long  amount){
        if(accountBalance <= 0) throw new RuntimeException("Withdrawal must be positive");
        if(this.accountBalance < amount) throw new RuntimeException("Withdrawal not possible. Insufficient funds");
        this.accountBalance -=  amount;
        System.out.println("Withdrew: " + amount + ". New Balance: " + accountBalance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "customerName='" + customerName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
