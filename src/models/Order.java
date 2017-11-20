package models;

import util.WarehouseUtil;

import java.util.Date;
import java.util.List;

/**
 * Order class to represent a customer's order.
 * It has many relationships throughout this use case, as it is the central model and object being acted upon.
 */
public class Order {

    private String orderId;
    private List<WarehouseItem> items;
    private Customer customer;
    private Address source;
    private Address destination;
    private String trackingNumber;
    private Date orderedOn;
    private Driver driver;

    public Order(List<WarehouseItem> items, Customer customer) {
        this.items = items;
        this.customer = customer;
        orderedOn = new Date();
        destination = customer.getAddress();
        orderId = WarehouseUtil.generateId();
        trackingNumber = WarehouseUtil.generateId();
    }

    @Override
    public String toString() {
        return "orderId='" + orderId + '\'' +
                ", \nitems=" + items +
                ", \ncustomer=" + customer +
                ", \nsource=" + source +
                ", \ndestination=" + destination +
                ", \ntrackingNumber='" + trackingNumber + '\'' +
                ", \norderedOn=" + orderedOn +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public List<WarehouseItem> getItems() {
        return items;
    }

    public void setItems(List<WarehouseItem> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getSource() {
        return source;
    }

    public void setSource(Address source) {
        this.source = source;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Date getOrderedOn() {
        return orderedOn;
    }

    public void setOrderedOn(Date orderedOn) {
        this.orderedOn = orderedOn;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
