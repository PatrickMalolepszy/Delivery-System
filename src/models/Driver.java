package models;

import util.WarehouseUtil;

public class Driver {

    private String driverId;
    private TransportVehicle transportVehicle;

    public Driver(TransportVehicle transportVehicle) {
        driverId = WarehouseUtil.generateId();
        this.transportVehicle = transportVehicle;
    }
}
