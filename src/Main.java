import RoomImpl.Room;

public class Main
{
    public static void main(String[] args)
    {
        Hotel hotel = new Hotel();

        for (Room r: hotel.rooms)
        {
            System.out.println(r.toString());
        }


    }
}