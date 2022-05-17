import IOImpl.FileIO;
import RoomImpl.*;

import java.util.Scanner;

class Hotel
{
    Hotel hotel;
    private FileIO fileIO = new FileIO();

    Room[] rooms = new Room[40];
    String[] data;

    public Hotel()
    {
        hotelSetup();
    }

    private void hotelSetup()
    {
        String[] roomData = fileIO.readRoomData();
        //System.out.println(roomData.length);
        createRooms(roomData);
        //printRooms();
        //hotel = new Hotel(roomData);
    }

    private void printRooms() {
        for (int i = 0; i < rooms.length; i++)
        {
            System.out.println(rooms[i]);
        }
    }


    public void createRooms(String[] data)
    {
        for(int i = 0; i < data.length; i++){
            String[] tmpData = data[i].split(",");
            int ID = Integer.parseInt(tmpData[0]);
            String roomType = tmpData[1];
            String floor = tmpData[2];
            int floorNumber = Integer.parseInt(tmpData[3]);
            int price = Integer.parseInt(tmpData[4]);
            Room room = null;
            //System.out.println(roomType);
            switch(roomType){
                case "StandardSingleRoom":
                    room = new StandardSingleRoom(ID, tmpData[1], floor, floorNumber, price);
                    break;
                case "StandardDoubleRoom":
                    room = new StandardDoubleRoom(ID, tmpData[1], floor, floorNumber, price);
                    break;
                case "LuxurySingleRoom":
                    room = new LuxurySingleRoom(ID, tmpData[1], floor, floorNumber, price);
                    break;
                case "LuxuryDoubleRoom":
                    room = new LuxuryDoubleRoom(ID, tmpData[1], floor, floorNumber, price);
                    break;
            }
            rooms[i] = room;
        }
    }
    static Scanner scanner = new Scanner(System.in);

    public static void HotelManagement()
    {
        System.out.println("Velkommen til Hotel Management System");
        System.out.println("1. Book et vaerelse");
        System.out.println("2. Check ind i et vaerelse");
        System.out.println("3. Check ud af et vaerelse");
        System.out.println("4. Annuller en reservation");
        System.out.println("5. Liste over alle vaerelser");
        System.out.println("6. Liste over alle reservationer");
        System.out.println("7. Afslut");
        System.out.println("Indtast dit valg: ");
        int choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
                Booking booking = new Booking();
                //booking(roomNumber, guestNumber, duration, checkStatus);

                break;
            case 2:
                //CheckIn();
                break;
            case 3:
                //CheckOut();
                break;
            case 4:
                //CancelBooking();
                break;
            case 5:
                //ListAllRooms();
                break;
            case 6:
                //ListAllBookings();
                break;
            case 7:
                System.out.println("Tak fordi du bruger Hotel Management System");
                break;
            default:
                System.out.println("Ugyldigt valg");
                break;
        }
    }
}