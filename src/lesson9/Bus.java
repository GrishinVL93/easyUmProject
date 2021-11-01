package lesson9;

public class Bus extends Vehicle {
    private int countPeople;
    private int maxPeople;

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.peopleOnBase += countPeople;
    }

    @Override
    public boolean leave() {
        if(!canLeave()){
            return false;
        }

        Base.peopleOnBase--;
        Base.vehiclesOnBase--;
        Base.petrolOnBase = Base.petrolOnBase - (getTankVolume() - getPetrolAmount());

        if(Base.peopleOnBase >= (maxPeople- countPeople)){
            Base.peopleOnBase -= (maxPeople - countPeople);
            countPeople = countPeople + Base.peopleOnBase;
            Base.peopleOnBase = 0;
        }

        return  true;
    }
}
