package lesson9;

public class Truck extends Vehicle {
    private int goods;
    private int maxLoad;
    private int currentLoad;

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }

    @Override
    public void arrive() {
        super.arrive();
        /*Base.*/
    }

    @Override
    public boolean leave() {
        return super.leave();
    }
}
