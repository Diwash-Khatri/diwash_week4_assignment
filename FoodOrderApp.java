class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
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

    public void displayMenuItem() {
        System.out.println("Name: " + name);
        System.out.println("Price: Rupee" + price);
    }
}

class Pizza extends FoodItem {
    private String size;
    private String[] toppings;

    public Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    @Override
    public void displayMenuItem() {
        super.displayMenuItem();
        System.out.println("Size: " + size);
        System.out.print("Toppings: ");
        if (toppings != null && toppings.length > 0) {
            for (int i = 0; i < toppings.length; i++) {
                System.out.print(toppings[i]);
                if (i < toppings.length - 1) System.out.print(", ");
            }
        } else {
            System.out.print("None");
        }
        System.out.println();
    }
}

class Burger extends FoodItem {
    private boolean cheese;
    private String pattyType;

    public Burger(String name, double price, boolean cheese, String pattyType) {
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public String getPattyType() {
        return pattyType;
    }

    public void setPattyType(String pattyType) {
        this.pattyType = pattyType;
    }

    @Override
    public void displayMenuItem() {
        super.displayMenuItem();
        System.out.println("Cheese: " + (cheese ? "Yes" : "No"));
        System.out.println("Patty Type: " + pattyType);
    }
}

class Salad extends FoodItem {
    private String[] ingredients;

    public Salad(String name, double price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public void displayMenuItem() {
        super.displayMenuItem();
        System.out.print("Ingredients: ");
        if (ingredients != null && ingredients.length > 0) {
            for (int i = 0; i < ingredients.length; i++) {
                System.out.print(ingredients[i]);
                if (i < ingredients.length - 1) System.out.print(", ");
            }
        } else {
            System.out.print("None");
        }
        System.out.println();
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {
        FoodItem pizza = new Pizza("Pizza", 800, "Large", new String[]{"Cheese", "Tomato", "Basil"});
        FoodItem burger = new Burger("Burger", 150, true, "Beef");
        FoodItem salad = new Salad("Salad", 200, new String[]{"Lettuce", "Onion",});

        pizza.displayMenuItem();
        System.out.println();
        burger.displayMenuItem();
        System.out.println();
        salad.displayMenuItem();
    }
}
