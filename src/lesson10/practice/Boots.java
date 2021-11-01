package lesson10.practice;

public class Boots extends Footwear implements FootwearForFix{
    public void repair(){
        System.out.println("Repairing boots");
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
