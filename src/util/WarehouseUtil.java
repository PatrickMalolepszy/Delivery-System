package util;

import java.util.UUID;

/**
 * WarehouseUtil to provide static methods to assist in miscellaneous tasks.
 */
public class WarehouseUtil {
    // To generate unique identifiers:
    public static String generateId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
