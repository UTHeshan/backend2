package cnc_pizza;

import java.util.List;

public class OrderItem {
    private String pizzaName;
    private double basePrice;
    private int quantity;
    private List<String> customizations; // New added items / toppings
    private double extraCost;

    public OrderItem(String pizzaName, double basePrice, int quantity, List<String> customizations, double extraCost) {
        this.pizzaName = pizzaName;
        this.basePrice = basePrice;
        this.quantity = quantity;
        this.customizations = customizations;
        this.extraCost = extraCost;
    }

    // Calculation Method (OOP Logic)
    public double calculateTotal() {
        return (basePrice + extraCost) * quantity;
    }

    public String getPizzaName() { return pizzaName; }
    public int getQuantity() { return quantity; }
    public List<String> getCustomizations() { return customizations; }
}
