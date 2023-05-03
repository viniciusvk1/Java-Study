package Heranca.Exemplo1.entities.application;

import Heranca.Exemplo1.entities.Account;
import Heranca.Exemplo1.entities.BusinessAccount;
import Heranca.Exemplo1.entities.SavingsAccount;


public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Vinicius", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Camile", 0.0, 500.00);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Fernanda", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ulisses", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        // BusinessAcount acc5 = (BusinessAcount) acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account acc10 = new Account(1010, "Vini", 1000.00);
        acc10.withdraw(200.00);
        System.out.println(acc10.getBalance());

        Account acc11 = new SavingsAccount(1011, "Pedro", 1000.00, 0.01);
        acc11.withdraw(200.00);
        System.out.println(acc11.getBalance());

    }

}