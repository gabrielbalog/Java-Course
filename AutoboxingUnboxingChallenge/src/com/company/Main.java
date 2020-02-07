package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Inter");
        Customer customer = new Customer("Gabriel", 10.0);
        Customer customer2 = new Customer("Jayme", 10.0);
        Branch branch = new Branch("Left");
        Branch branch2 = new Branch("Right");

//        bank.addBranch(branch);
//        bank.printBranches();
//        System.out.println("-----");
//        bank.addCustomerToBranch(customer, branch);
//        bank.printCustomers(branch);
//        System.out.println("-----");
//        bank.printCustomerTransactions(branch, customer);
//        bank.addTransactionToCustomer(customer, branch, 15.47);
//        bank.printCustomerTransactions(branch, customer);

        // Error: Insert twice the same branch
//        bank.addBranch(branch);
//        bank.addBranch(branch);
//        bank.printBranches();

        // Error: Insert twice the same customer on the same branch
//        bank.addBranch(branch);
//        bank.printBranches();
//        System.out.println();
//        bank.addCustomerToBranch(customer, branch);
//        bank.addCustomerToBranch(customer, branch);
//        bank.printCustomers(branch);

        // Error: Get Information about branch that do not exists
//        bank.addBranch(branch);
//        bank.printBranches();
//        bank.printCustomers(branch2);

        // Error: Get information about a customer not registered
//        bank.addBranch(branch);
//        bank.printBranches();
//        bank.printCustomerTransactions(branch, customer);

        // Add customer to branch that is not registered
//        bank.addCustomerToBranch(customer, branch);

//        Add customer to branch that is not registered
//        bank.addTransactionToCustomer(customer, branch, 10.0);

    }
}
