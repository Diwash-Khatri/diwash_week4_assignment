class Ticket {
    private String ticketNumber;
    private double price;

    public Ticket(String ticketNumber, double price) {
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void generateTicket() {
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Price: Rupee" + price);
    }
}

class BusTicket extends Ticket {
    private String seatNumber;

    public BusTicket(String ticketNumber, double price, String seatNumber) {
        super(ticketNumber, price);
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void generateTicket() {
        System.out.println("Bus Ticket");
        super.generateTicket();
        System.out.println("Seat Number: " + seatNumber);
        System.out.println();
    }
}

class TrainTicket extends Ticket {
    private String coachType;

    public TrainTicket(String ticketNumber, double price, String coachType) {
        super(ticketNumber, price);
        this.coachType = coachType;
    }

    public String getCoachType() {
        return coachType;
    }

    public void setCoachType(String coachType) {
        this.coachType = coachType;
    }

    @Override
    public void generateTicket() {
        System.out.println("Train Ticket");
        super.generateTicket();
        System.out.println("Coach Type: " + coachType);
        System.out.println();
    }
}

class FlightTicket extends Ticket {
    private String boardingGate;

    public FlightTicket(String ticketNumber, double price, String boardingGate) {
        super(ticketNumber, price);
        this.boardingGate = boardingGate;
    }

    public String getBoardingGate() {
        return boardingGate;
    }

    public void setBoardingGate(String boardingGate) {
        this.boardingGate = boardingGate;
    }

    @Override
    public void generateTicket() {
        System.out.println("Flight Ticket");
        super.generateTicket();
        System.out.println("Boarding Gate: " + boardingGate);
        System.out.println();
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        Ticket bus = new BusTicket("B12345", 1500, "12A");
        Ticket train = new TrainTicket("T67890", 4500, "Sleeper");
        Ticket flight = new FlightTicket("F54321", 35000, "Gate 5");

        bus.generateTicket();
        train.generateTicket();
        flight.generateTicket();
    }
}
