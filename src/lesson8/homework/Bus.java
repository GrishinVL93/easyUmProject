package lesson8.homework;

public class Bus extends Vehicle {
    private int people;
    private int max_people;

    public Bus(int people, int max_people, double petrol_amount, double tank_volume) {
        super(petrol_amount, tank_volume);
        this.people = people;
        this.max_people = max_people;
    }

    public int getPeople() {
        return people;
    }

    public int getMaxPeople() {
        return max_people;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.people_on_base+=people;

    }

    @Override
    public boolean leave() {
        if(Base.petrol_on_base - (getTankVolume() - getPetrolAmount()) < 0){
            return false;
        }
        else {
            Base.petrol_on_base = Base.petrol_on_base - (getTankVolume() - getPetrolAmount());
            Base.people_on_base = Base.people_on_base - (this.max_people - this.people) - 1;
            Base.vehicles_ob_base--;

            if (Base.people_on_base - (this.max_people - this.people) >= 0) {
                Base.people_on_base = Base.people_on_base - (this.max_people - this.people);
                this.people = this.max_people;
            } else {
                this.people = this.people + Base.people_on_base;
                Base.people_on_base = 0;
            }

            return true;
        }
    }
}
