package models;

import util.WarehouseUtil;

public class TransportVehicle {
    private String vehicleId;

    public TransportVehicle() {
        vehicleId = WarehouseUtil.generateId();
    }
}
