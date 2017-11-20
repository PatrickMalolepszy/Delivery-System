package models;

public class WarehouseItemDescription {

    private String itemId;
    private String description;
    private Double price;
    private String warehouseLocation;

    public WarehouseItemDescription(String itemId, String description, Double price, String warehouseLocation) {
        this.itemId = itemId;
        this.description = description;
        this.price = price;
        this.warehouseLocation = warehouseLocation;
    }

    @Override
    public String toString() {
        return "\n\titemId='" + itemId + '\'' +
                ", \n\tdescription:'" + description + '\'' +
                ", \n\tprice=" + price +
                ", \n\twarehouseLocation='" + warehouseLocation + '\'' +
                '}';
    }

    // GETTERS
    public String getItemId() {
        return itemId;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getWarehouseLocation() {
        return warehouseLocation;
    }

}
