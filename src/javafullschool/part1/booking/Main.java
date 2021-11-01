package javafullschool.part1.booking;

public class Main {
    public static void main(String[] args) {
        Bill loriBill = new Bill(43434);
        Client loriClient = new Client("Lori","Petrov","maillori","+4738473",loriBill);

        Bill baxBill = new Bill(30430);
        Client baxClient = new Client("Bax", "Petro","fdsjdf","+34374",baxBill);

        Room[] californiaRoomsHotel = {new Room(2,4000,true),new Room(2,5000,false),
        new Room(1,2500,true),new Room(3,3500,true)};

        Hotel californiaHotel = new Hotel("California",californiaRoomsHotel);

        Room[] hayattRoomsHotel = {new Room(2,14000,true),new Room(2,15000,false),
                new Room(1,12500,true),new Room(3,33500,true)};

        Hotel hayattHotel = new Hotel("Hayatt",hayattRoomsHotel);



    }
}
