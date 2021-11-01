package lesson10.practice;

public class Main {
    public static void main(String[] args) {
        Boots boot1 = new Boots();
        Boots boot2 = new Boots();
        Boots boot3 = new Boots();

        Shoe shoe1 = new Shoe();
        Shoe shoe2 = new Shoe();
        Shoe shoe3 = new Shoe();


        Footwear[] footwears = new Footwear[6];
        footwears[0] = boot1;
        footwears[1] = boot2;
        footwears[2] = boot3;
        footwears[3] = shoe1;
        footwears[4] = shoe2;
        footwears[5] = shoe3;

        for(Footwear f: footwears){
            f.repair();
        }
    }
}
