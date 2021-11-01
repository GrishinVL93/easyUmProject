package lesson8.homework;

public class Truck extends Vehicle {
    private double load;
    private double max_load;


    public Truck(double load, double max_load, double petrol_amount, double tank_volume) {
        super(petrol_amount, tank_volume);
        this.load = load;
        this.max_load = max_load;
    }

    public double getCurrentLoad() {
        return load;
    }

    public double getMaxLoad() {
        return max_load;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.goods_on_base += load;
    }

    @Override
    public boolean leave() {
        if ((Base.petrol_on_base - (getTankVolume() - getPetrolAmount()) < 0) && (Base.people_on_base <= 0)) {
            return false;
        } else {
            Base.petrol_on_base = Base.petrol_on_base - (getTankVolume() - getPetrolAmount());
            Base.people_on_base--;
            Base.vehicles_ob_base--;
            if (Base.goods_on_base - (max_load - load) >= 0) {
                Base.goods_on_base = Base.goods_on_base - (max_load - load);
                load = max_load;
            } else {
                load = load + Base.goods_on_base;
                Base.goods_on_base = 0;
            }
            return true;
        }
    }
}
