package controllers;

import io.WarehouseIO;
import models.Address;
import models.Driver;
import models.Order;
import models.WarehouseItem;

import java.util.*;

/**
 * Warehouse is the main controller for the system.
 * It is responsible for responding to input and output and to handle actions appropriately.
 * The fulfill shipment use case is implemented through this class by handling all loading operations.
 */
public class Warehouse {

    private String warehouseId;
    private Address address;
    private Map<String, Order> currentOrders;
    private Map<String, WarehouseItem> inventory;
    private Queue<Driver> availableDrivers;

    // CONSTRUCTOR
    public Warehouse(Address address, List<WarehouseItem> inventory, Queue<Driver> availableDrivers) {
        warehouseId = UUID.randomUUID().toString();
        this.address = address;
        // fill inventory:
        this.inventory = new HashMap<>();
        for (WarehouseItem item : inventory) {
            this.inventory.put(item.getDescription().getItemId(), item);
        }
        currentOrders = new HashMap<>();
        this.availableDrivers = availableDrivers;
    }

    // METHODS:
    public void receiveOrder(Order order) {
        order.setSource(address);
        currentOrders.put(order.getOrderId(), order);
    }

    public void startLoadingOperations() {
        int menuSelection = 0;
        while (menuSelection != 3) {
            switch (menuSelection  = WarehouseIO.Menu()) {
                case 1: // display orders
                    for(Order order : currentOrders.values()) {
                        WarehouseIO.displayOrder(order);
                    }
                    break;
                case 2: // start an order
                    String orderID = WarehouseIO.getOrderId();
                    Order order = currentOrders.get(orderID);
                    if (order == null) {
                        WarehouseIO.NoOrderExists(orderID);
                    } else {
                        // Load items into map:
                        Map<String, WarehouseItem> itemsToBeLoaded = new HashMap<>();
                        for (WarehouseItem item : order.getItems()) {
                            itemsToBeLoaded.put(item.getDescription().getItemId(), item);
                        }

                        while (!itemsToBeLoaded.isEmpty()) {
                            WarehouseIO.displayItemsToBeLoaded(itemsToBeLoaded);
                            String itemId = WarehouseIO.loadItem();
                            int quantity = WarehouseIO.getItemQuantity();
                            if (!itemsToBeLoaded.containsKey(itemId)) {
                                WarehouseIO.NoItemExists(itemId);
                                continue;
                            }
                            WarehouseItem itemLoaded = itemsToBeLoaded.get(itemId);
                            int currentQuantity = itemLoaded.getQuantity();
                            itemLoaded.setQuantity(currentQuantity - quantity);
                            if (itemLoaded.getQuantity() <= 0) {
                                if (itemLoaded.getQuantity() < 0) {
                                    WarehouseIO.loadedTooManyError(-1 * itemLoaded.getQuantity());
                                }
                                itemsToBeLoaded.remove(itemId);
                                WarehouseItem inventoryItem = inventory.get(itemId);
                                int previousInventory = inventoryItem.getQuantity();
                                inventoryItem.setQuantity(previousInventory - quantity);
                            }

                        }
                        WarehouseIO.doneLoading(orderID);
                        shipLoadedOrder(order);
                    }
            }
        }
    }

    private void shipLoadedOrder(Order order) {
        if (availableDrivers.isEmpty()) {
            WarehouseIO.NoDriverError();
            return;
        }
        Driver driver = availableDrivers.remove();
        order.setDriver(driver);
    }

    // GETTERS AND SETTERS:
    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
