package javafullschool.part1.OOP.banksystem;

import javafullschool.part1.OOP.banksystem.entity.Account;
import javafullschool.part1.OOP.banksystem.entity.Bill;
import javafullschool.part1.OOP.banksystem.entity.Person;
import javafullschool.part1.OOP.banksystem.service.DepositService;
import javafullschool.part1.OOP.banksystem.service.PaymentService;
import javafullschool.part1.OOP.banksystem.service.TransferService;

public class Main {
    public static void main(String[] args) {
        Person loriPerson = new Person("Lori","Ivanov","+790090940343");
        Bill loriBill = new Bill(34349);
        Account loriAccount = new Account(loriPerson,loriBill);


        Person martinPerson = new Person("Martin","Larin","+8548548");
        Bill martinBill = new Bill(445485);
        Account martinAccount = new Account(martinPerson,martinBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(loriAccount, 10000);
        paymentService.pay(martinAccount,83483);


        DepositService depositService = new DepositService();
        depositService.deposit(loriAccount,5000);

        TransferService transferService = new TransferService();
        transferService.transfer(martinAccount,loriAccount,34340);

    }
}
