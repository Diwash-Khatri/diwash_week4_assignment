class SmartDevice {
    protected String brand;
    protected String model;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void turnOn() {
        System.out.println("Turning on the device.");
    }

    public void turnOff() {
        System.out.println("Turning off the device.");
    }
}

class SmartPhone extends SmartDevice {
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Booting up the smartphone: " + brand + " " + model);
    }

    @Override
    public void turnOff() {
        System.out.println("Shutting down the smartphone: " + brand + " " + model);
    }
}

class SmartWatch extends SmartDevice {
    public SmartWatch(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Powering on the smartwatch: " + brand + " " + model);
    }

    @Override
    public void turnOff() {
        System.out.println("Powering off the smartwatch: " + brand + " " + model);
    }
}

public class SmartDevices {
    public static void main(String[] args) {
        SmartDevice myPhone = new SmartPhone("Apple", "iPhone 14");
        SmartDevice myWatch = new SmartWatch("Samsung", "Galaxy Watch 5");

        myPhone.turnOn();
        myPhone.turnOff();

        myWatch.turnOn();
        myWatch.turnOff();
    }
}
