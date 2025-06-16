class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: Rupee" + price);
    }
}

class Electronics extends Product {
    private int warrantyPeriod;

    public Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}

class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

class Grocery extends Product {
    private String expiryDate;

    public Grocery(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {
        Product laptop = new Electronics("Laptop", 100000, 24);
        Product tshirt = new Clothing("T-Shirt", 2000, "L", "Cotton");
        Product milk = new Grocery("Milk", 100, "2025-12-01");

        System.out.println("Electronics:");
        laptop.displayDetails();

        System.out.println("\nClothing:");
        tshirt.displayDetails();

        System.out.println("\nGrocery:");
        milk.displayDetails();
    }
}
