package javafullschool.part1.OOP.banksystem.service;

import javafullschool.part1.OOP.banksystem.entity.Account;
import javafullschool.part1.OOP.banksystem.entity.Bill;

public class PaymentService {
    public void pay(Account account, int amount){
        Bill bill = account.getBill();
        if(bill.getAmount() < amount){
            System.out.println("Платеж невозможен");
        }else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происходит операция платежа, текущее значение счета: " + currentBillAmount);
            bill.setAmount(currentBillAmount-amount);
            System.out.println("Платеж завершен, новое значение счета: " + bill.getAmount());
        }
    }
}
