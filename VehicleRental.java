class Vehicle {
    private String plateNumber;
    private double baseRate;

    public Vehicle(String plateNumber, double baseRate) {
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public double calculateRental(int days) {
        return baseRate * days;
    }
}

class Car extends Vehicle {
    public Car(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }

    @Override
    public double calculateRental(int days) {
        return getBaseRate() * days;
    }
}

class Truck extends Vehicle {
    private double loadFee;

    public Truck(String plateNumber, double baseRate, double loadFee) {
        super(plateNumber, baseRate);
        this.loadFee = loadFee;
    }

    public double getLoadFee() {
        return loadFee;
    }

    public void setLoadFee(double loadFee) {
        this.loadFee = loadFee;
    }

    @Override
    public double calculateRental(int days) {
        return (getBaseRate() * days) + loadFee;
    }
}

class Bike extends Vehicle {
    private double fixedRate;

    public Bike(String plateNumber, double fixedRate) {
        super(plateNumber, fixedRate);
        this.fixedRate = fixedRate;
    }

    @Override
    public double calculateRental(int days) {
        return fixedRate;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle car = new Car("123", 50);
        Vehicle truck = new Truck("456", 100, 200);
        Vehicle bike = new Bike("789", 30);

        System.out.println("Car rental for 5 days: " + car.calculateRental(5));
        System.out.println("Truck rental for 5 days: " + truck.calculateRental(5));
        System.out.println("Bike rental for any days: " + bike.calculateRental(5));
    }
}

