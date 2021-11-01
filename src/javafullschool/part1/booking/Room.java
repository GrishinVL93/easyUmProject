package javafullschool.part1.booking;

public class Room {

    private int numOfPerson;

    private int cost;

    private boolean isFree;

    public Room(int numOfPerson, int cost, boolean isFree) {
        this.numOfPerson = numOfPerson;
        this.cost = cost;
        this.isFree = isFree;
    }

    public int getNumOfPerson() {
        return numOfPerson;
    }

    public void setNumOfPerson(int numOfPerson) {
        this.numOfPerson = numOfPerson;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
