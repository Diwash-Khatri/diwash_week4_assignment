class Device {
    private String deviceName;

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void operate() {
        System.out.println(deviceName + " is operating.");
    }
}

class Light extends Device {
    public Light(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + " turned on the light.");
    }
}

class Fridge extends Device {
    public Fridge (String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + " set the temperature.");
    }
}

class SecurityCamera extends Device {
    public SecurityCamera(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + " started recording.");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Device[] devices = {
            new Light("Living Room Light"),
            new Fridge("Temperature"),
            new SecurityCamera("Front Door Camera")
        };

        for (Device device : devices) {
            device.operate();
        }
    }
}
