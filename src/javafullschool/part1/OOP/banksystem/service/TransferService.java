package javafullschool.part1.OOP.banksystem.service;

import javafullschool.part1.OOP.banksystem.entity.Account;

public class TransferService {

    public void transfer(Account accountFrom, Account accountTo, int amount){
        int amountAccountFrom = accountFrom.getBill().getAmount();
        int amountAccountTo = accountTo.getBill().getAmount();

        if(amountAccountFrom < amount){
            System.out.println("Операция невозможна");
        }
        else {

            System.out.println("Осуществляется переводст средств с счета " + accountFrom.getAccountHolder().getFirstName() +
                    " на счет " + accountTo.getAccountHolder().getFirstName());
            accountFrom.getBill().setAmount(amountAccountFrom - amount);
            accountTo.getBill().setAmount(amountAccountTo + amount);
            System.out.println("Платеж успешно осуществлен");
        }
    }
}
