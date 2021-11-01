package javafullschool.part1.OOP.banksystem.service;

import javafullschool.part1.OOP.banksystem.entity.Account;
import javafullschool.part1.OOP.banksystem.entity.Bill;

public class DepositService {

    public void deposit(Account account, int amount){
        Bill bill = account.getBill();
        int currentBillAmount = bill.getAmount();
        System.out.println("Текущее значение счета: " + currentBillAmount);
        bill.setAmount(currentBillAmount + amount);
        System.out.println("Происходит пополнение, новое значение счета: " + bill.getAmount());
    }
}
