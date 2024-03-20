package hu.shop.shoppinglist.model;

public class Shopping {

    private String name;
    private int quantity;
    private int priority;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", priority=" + priority +
                '}';
    }
}
