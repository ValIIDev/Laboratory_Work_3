// Main.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface ElectronicDevice {
    String getName();
    double getPrice();
    String getType();
    void setPrice(double price);
    void setName(String name);
    void setType(String type);
}

class Laptop implements ElectronicDevice {
    private String name;
    private double price;
    private String type;
    private int BatteryLife;
    private int RamSize;
    private int ScreenSize;
    private int StorageSize;
    private int Weight;

    // Constructor
    public Laptop(String name, double price) {
        this.name = name;
        this.price = price;
        this.type = "Laptop";
    }

    // Implementing interface methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public int getBatteryLife() {
        return BatteryLife;
    }
    public int getRamSize() {
        return RamSize;
    }
    public int getScreenSize() {
        return ScreenSize;
    }
    public int getStorageSize() {
        return StorageSize;
    }
    public int getWeight() {
        return Weight;
    }

    public void setBatteryLife(int batteryLife) {
        BatteryLife = batteryLife;
    }

    public void setRamSize(int ramSize) {
        RamSize = ramSize;
    }

    public void setScreenSize(int screenSize) {
        ScreenSize = screenSize;
    }

    public void setStorageSize(int storageSize) {
        StorageSize = storageSize;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

}
class SmartPhone implements ElectronicDevice {
    private String name;
    private double price;
    private String type;
    private int BatteryLife;
    private int CameraResolution;
    private String Connectivy;

    // Constructor
    public SmartPhone(String name, double price) {
        this.name = name;
        this.price = price;
        this.type = "Smartphone";
    }

    // Implementing interface methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public int getBatteryLife() {
        return BatteryLife;
    }
    public int getCameraResolution() {
        return CameraResolution;
    }
    public String getConnectivity() {
        return Connectivy;
    }

    public void setBatteryLife(int batteryLife) {
        BatteryLife = batteryLife;
    }

    public void setScreenSize(int cameraRes) {
        CameraResolution = cameraRes;
    }
    public void setConnectivity(String connectivity) {
        Connectivy = connectivity;
    }



}
class SmartWatch implements ElectronicDevice {
    private String name;
    private double price;
    private String type;
    private int BatteryLife;
    private double BandSize;
    private String ScreenType;


    public SmartWatch(String name, double price) {
        this.name = name;
        this.price = price;
        this.type = "SmartWatch";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public void setBatteryLife(int batteryLife) {
        BatteryLife = batteryLife;
    }
    public void setBandSize(double bandSize) {
        BandSize = bandSize;
    }
    public void setScreenType(String screenType) {
        ScreenType = screenType;
    }
    public int getBatteryLife() {
        return BatteryLife;
    }
    public double getBandSize() {
        return BandSize;
    }
    public String getScreenType() {
        return ScreenType;
    }

}

public class Main {
    public static void main(String[] args) {
        List<ElectronicDevice> electronicDevices = new ArrayList<>();

        Laptop laptop1 = new Laptop("Dell", 1000);
        laptop1.setBatteryLife(10);
        laptop1.setRamSize(8);
        laptop1.setScreenSize(15);
        laptop1.setStorageSize(512);
        laptop1.setWeight(2000);
        Laptop laptop2 = new Laptop("HP", 800);
        Laptop laptop3 = new Laptop("Lenovo", 700);
        Laptop laptop4 = new Laptop("Asus", 600);
        SmartPhone smartphone1 = new SmartPhone("Samsung", 500);
        SmartPhone smartphone2 = new SmartPhone("Apple", 1000);
        SmartPhone smartphone3 = new SmartPhone("Huawei", 600);
        SmartPhone smartphone4 = new SmartPhone("Xiaomi", 400);

        SmartWatch smartwatch1 = new SmartWatch("Apple", 500);
        SmartWatch smartwatch2 = new SmartWatch("Samsung", 400);
        SmartWatch smartwatch3 = new SmartWatch("Huawei", 300);
        SmartWatch smartwatch4 = new SmartWatch("Xiaomi", 200);


        Collections.addAll(electronicDevices, laptop1, laptop2, laptop3, laptop4,
                smartphone1, smartphone2, smartphone3, smartphone4,
                smartwatch1, smartwatch2, smartwatch3, smartwatch4);

        Collections.sort(electronicDevices, (device1, device2) ->
                Double.compare(device1.getPrice(), device2.getPrice()));

        // Print the details of all electronic devices
        for (ElectronicDevice device : electronicDevices) {
            System.out.println("Name: " + device.getName());
            System.out.println("Type: " + device.getType());
            System.out.println("Price: " + device.getPrice());
            System.out.println(); // Add a line break for better readability
        }
    }
}