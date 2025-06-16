class Seat {
    private String seatNumber;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void bookSeat() {
        System.out.println("Seat " + seatNumber + " booked.");
    }
}

class RegularSeat extends Seat {
    public RegularSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public void bookSeat() {
        System.out.println("Regular seat " + getSeatNumber() + " booked anytime.");
    }
}

class PremiumSeat extends Seat {
    public PremiumSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public void bookSeat() {
        System.out.println("Premium seat " + getSeatNumber() + " booked with snack and luxury.");
    }
}

public class TheaterBooking {
    public static void main(String[] args) {
        Seat regular = new RegularSeat("A10");
        Seat premium = new PremiumSeat("B1");

        regular.bookSeat();
        premium.bookSeat();
    }
}
