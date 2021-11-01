package lesson8.homework;

public class Vehicle {
    private double petrol_amount;
    private double tank_volume;

    public Vehicle(double petrol_amount,double tank_volume){
        this.petrol_amount = petrol_amount;
        this.tank_volume = tank_volume;
    }

    public double getPetrolAmount() {
        return petrol_amount;
    }

    public double getTankVolume() {
        return tank_volume;
    }

    public void arrive(){
        Base.people_on_base++;
        Base.vehicles_ob_base++;
    }

    public boolean leave(){
        if((Base.petrol_on_base - (tank_volume-petrol_amount) < 0) &&(Base.people_on_base <= 0)){
            return false;
        }
        else {
                Base.petrol_on_base = Base.petrol_on_base - (tank_volume - petrol_amount);
                Base.people_on_base--;
                Base.vehicles_ob_base--;
                return true;
        }
    }
}
