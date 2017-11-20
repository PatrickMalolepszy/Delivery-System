package io;

import models.Order;
import models.WarehouseItem;

import java.util.Map;
import java.util.Scanner;

/**
 * WarehouseIO is designed to handle all input and output for the warehouse system.
 * For this assignment simple terminal io has been used, but for a more real world application
 * this class would be implemented using proper warehouse scanners and input devices.
 */
public class WarehouseIO {

    public static int Menu() {
        System.out.println("----Warehouse Menu----");
        System.out.println("Please select one of the following:");
        System.out.println("1: See pending orders");
        System.out.println("2: Start loading order");
        System.out.println("3: Shutdown system");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static void displayOrder(Order order) {
        System.out.println(order);
    }

    public static String getOrderId() {
        System.out.println("Please enter the order id you would like to start loading:");
        return new Scanner(System.in).next();
    }

    public static String loadItem() {
        System.out.println("Please enter item id that has been loaded:");
        return new Scanner(System.in).next();
    }

    public static void displayItemsToBeLoaded(Map<String, WarehouseItem> itemsToBeLoaded) {
        System.out.println("Please load one of the following items:");
        for (Map.Entry<String, WarehouseItem> item :  itemsToBeLoaded.entrySet()) {
            System.out.println("id: " + item.getKey() + ", quantity: " + item.getValue().getQuantity() + ", description: " + item.getValue().getDescription()
                    .getDescription() + ", location: " + item.getValue().getDescription().getWarehouseLocation());
        }
    }

    public static int getItemQuantity() {
        System.out.println("How many did you load?");
        return new Scanner(System.in).nextInt();
    }

    public static void loadedTooManyError(int overloadedItems) {
        System.out.println("Looks like you loaded too many items! Please remove " + overloadedItems + " items");
    }

    public static void doneLoading(String orderId) {
        System.out.println("\nYou are finished order #" + orderId);
    }

    public static void NoOrderExists(String orderID) {
        System.out.println("No order exists with id #" + orderID);
    }

    public static void NoItemExists(String itemId) {
        System.out.println("No item exists with id #" + itemId);
    }

    public static void NoDriverError() {
        System.out.println("No driver is available to deliver the order");
    }
}
