package com.company;

public class Main {

    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount(
//                12345, 0.0, "Gabriel", "gabriel@gmail.com", "95478"
//        );
//
//        BankAccount myAccount2 = new BankAccount();
//
//        System.out.println(myAccount2.getBalance());
//        System.out.println(myAccount2.getEmail());
//        System.out.println(myAccount2.getName());
//
//        myAccount.withdraw(500);
//
//        myAccount.setBalance(1000.00);
//
//        myAccount.withdraw(500);
//        myAccount.deposit(200);
//        myAccount.withdraw(1200);

        VipCustomer vipCustomer1 = new VipCustomer();
        VipCustomer vipCustomer2 = new VipCustomer("Gabriel", 1000);
        VipCustomer vipCustomer3 = new VipCustomer("Jorge", 10, "jorge@email.com");

        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println(vipCustomer1.getEmailAddress());
        System.out.println("----");
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println(vipCustomer2.getEmailAddress());
        System.out.println("----");
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getCreditLimit());
        System.out.println(vipCustomer3.getEmailAddress());
    }
}