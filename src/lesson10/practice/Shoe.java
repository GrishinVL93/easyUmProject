package lesson10.practice;

public class Shoe extends Footwear implements FootwearForFix {

    public void repair(){
        System.out.println("Repairing shoes");
    }

    @Override
    public String kindOfMaterial() {
        return null;
    }

    @Override
    public int condition() {
        return 0;
    }

    @Override
    public String sole() {
        return null;
    }
}
