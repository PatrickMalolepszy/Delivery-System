package models;

/**
 * WarehouseItem is a speicifc intense of a warehouse item(s).
 * It simply has the items quantity and description.
 */
public class WarehouseItem {

    private int quantity;
    private WarehouseItemDescription description;

    public WarehouseItem(int quantity, WarehouseItemDescription description) {
        this.quantity = quantity;
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "quantity=" + quantity +
                ", \n\tdescription=" + description +
                "}, \n";
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public WarehouseItemDescription getDescription() {
        return description;
    }

    public void setDescription(WarehouseItemDescription description) {
        this.description = description;
    }
}
