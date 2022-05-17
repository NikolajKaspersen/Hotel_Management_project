import java.util.ArrayList;

public class Booking
{
    String[] rooms;

    int roomNumber;
    int guestNumber;
    int duration;
    boolean bookingStatus;

    ArrayList<Booking> BookingList;
    //skal den her klasse bruges til data, eller kontrol af data? (arbejde med dem)

    public void Booking(int roomID, int guestNumber, int duration, boolean checkStatus)
    {
        this.roomNumber = roomID;
        this.guestNumber = guestNumber;
        this.duration = duration;
        this.bookingStatus = checkStatus;

        /*
        roomNumber = Room.getRoomID;
        guestID = Guest.getGuestID;
        duration = Guest.getGuestDuration;
        checkStatus = Room.getAvailable;
        */
    }

    public void bookRoom(Booking booking)
    {
        BookingList.add(booking);
        BookingList.remove(booking);
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public void check(boolean check)
    {
        bookingStatus = check;
    }

    public void cancelBooking(Booking booking)
    {
        BookingList.remove(booking);
    }

}