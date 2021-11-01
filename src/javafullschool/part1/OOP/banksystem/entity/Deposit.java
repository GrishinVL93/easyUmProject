package javafullschool.part1.OOP.banksystem.entity;

import javafullschool.part1.OOP.banksystem.entity.Bill;

public class Deposit {
    private Bill bill;

    public Deposit(Bill bill) {
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
