package main;

import controllers.Warehouse;
import models.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class main {

    // main to display main success scenario of use case.
    public static void main(String[] args) {

        Address customerAddress = new Address("123 St. John St. W Windsor", "CAN", "ON");
        Customer joe = new Customer("Joe Smith", customerAddress);

        List<WarehouseItem> orderItems = new ArrayList<>();
        orderItems.add(new WarehouseItem(2, WarehouseCatalog.desk));
        orderItems.add(new WarehouseItem(6, WarehouseCatalog.pen));
        orderItems.add(new WarehouseItem(12, WarehouseCatalog.pencil));
        orderItems.add(new WarehouseItem(6, WarehouseCatalog.paper));

        List<WarehouseItem> warehouseInventory = new ArrayList<>();
        warehouseInventory.add(new WarehouseItem(3450, WarehouseCatalog.desk));
        warehouseInventory.add(new WarehouseItem(6670, WarehouseCatalog.pen));
        warehouseInventory.add(new WarehouseItem(1420, WarehouseCatalog.pencil));
        warehouseInventory.add(new WarehouseItem(6234, WarehouseCatalog.paper));

        Address warehouseAddr = new Address("432 Miller St. Victoria", "CAN", "BC");

        TransportVehicle truck = new TransportVehicle();
        Driver driver = new Driver(truck);
        Queue<Driver> drivers = new LinkedList<>();
        drivers.add(driver);

        Warehouse warehouse = new Warehouse(warehouseAddr, warehouseInventory, drivers);

        Order order = new Order(orderItems, joe);

        warehouse.receiveOrder(order);

        warehouse.startLoadingOperations();
    }

}
