package javafullschool.part1.booking.bookingservices;

import javafullschool.part1.booking.Bill;
import javafullschool.part1.booking.Client;
import javafullschool.part1.booking.Hotel;
import javafullschool.part1.booking.Room;

public class BookingService {


    public void book(Hotel hotel, Client client, int numberOfPerson){
       Room[] rooms = hotel.getRooms();

       boolean isFreeRooms = false;

       for(Room r: rooms){
           if(r.isFree()){
               isFreeRooms = true;
           }
       }

       if(!isFreeRooms){
           System.out.println("Свободных номеров нет");
       }

        bookingRoom(client, numberOfPerson, rooms);

    }

    private void bookingRoom(Client client, int numberOfPerson, Room[] rooms) {
        for(Room r: rooms){
            if(r.getNumOfPerson() == numberOfPerson){
                System.out.println("Нашелся номер для пользователя: " + client.getName());
                if(client.getBill().getAmount() >= r.getCost()){
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount() - r.getCost());
                    r.setFree(false);
                    System.out.println("Номер успешно забронирован, клиент: " + client.getName());
                }
                else {
                    System.out.println("Недостаточно средств для бронирования у клиента: " + client.getName());
                }
            }else {
                System.out.println("Не нашлось нужного номера для пользователя: " + client.getName());
            }
        }
    }
}