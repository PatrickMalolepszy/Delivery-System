package models;

/**
 * WarehouseCatalog to divine a set of items which the warehouses store.
 */
public class WarehouseCatalog {
    public static final WarehouseItemDescription paper =
            new WarehouseItemDescription("1234","paper", 23.14, "2FB");
    public static final WarehouseItemDescription desk =
            new WarehouseItemDescription("4327","desk", 342.98, "5RD");
    public static final WarehouseItemDescription pencil =
            new WarehouseItemDescription("9735","pencil", 2.10, "1SD");
    public static final WarehouseItemDescription pen =
            new WarehouseItemDescription("6537","pen", 5.32, "7DF");
}
