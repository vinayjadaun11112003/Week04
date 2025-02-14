package com.bank_transaction_system_10;

//BankTransactionSystem --> This class is created for the control of the code flow.
public class BankTransactionSystem {
    //Main method to control the flow of code.
    public static void main(String[] args){
        Bank vinay = new Bank("vinay jadaun",123456);
        System.out.println(vinay.getName());
        System.out.println(vinay.getAccountNumber());
        System.out.println(vinay.getBalance());
        System.out.println(vinay);
        vinay.depositBalance(100);
        vinay.withdrawBalance(1000);
        vinay.depositBalance(100);
        vinay.withdrawBalance(1000);
    }

}
