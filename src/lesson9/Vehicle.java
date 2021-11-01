package lesson9;

public class Vehicle {
    private int driver = 1;
    private int tankVolume;
    private int petrolAmount;

    public int getPetrolAmount() {
        return petrolAmount;
    }

    public void setPetrolAmount(int petrolAmount) {
        this.petrolAmount = petrolAmount;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void arrive(){
        Base.peopleOnBase++;
        Base.vehiclesOnBase++;
    }

    public boolean leave(){

        if(!canLeave()){
            return false;
        }

        Base.peopleOnBase--;
        Base.vehiclesOnBase--;
        Base.petrolOnBase = Base.petrolOnBase - (getTankVolume() - getPetrolAmount());

        return true;
    }

    protected boolean canLeave(){
        if(Base.peopleOnBase < 1){
            return false;
        }

        if(Base.vehiclesOnBase < 1){
            return false;
        }

        if((tankVolume - petrolAmount) > Base.petrolOnBase){
            return false;
        }


        return true;
    }
}
