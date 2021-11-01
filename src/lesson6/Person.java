package lesson6;

public class Person {
    private int age;
    private String name;
    private String surname;
    private int income;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getAge(){
        return age;
    }
    public int getIncome(){
        return income;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }
}
