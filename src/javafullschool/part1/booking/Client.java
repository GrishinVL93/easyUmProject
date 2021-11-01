package javafullschool.part1.booking;

public class Client {

    private String name;

    private String surName;

    private String email;

    private String phone;

    private Bill bill;

    public Client(String name, String surName, String email, String phone, Bill bill) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.phone = phone;
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
