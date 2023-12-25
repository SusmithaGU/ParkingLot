package com.parkinglot.plot.model.parking;

import com.parkinglot.plot.model.Vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ParkingSpot {
    private int spotId;
    private Floor floorId;
    private ParkingSpotType type;
    private boolean isFree = true;
    private Vehicle vehicle;

    public ParkingSpot(int spotId, Floor floorId, ParkingSpotType type) {
        this.spotId = spotId;
        this.floorId = floorId;
        this.type = type;
    }

    public void fillSpot(Vehicle vehicle){
        this.isFree = false;
        setVehicle(vehicle);
    }
    public void vacateSpot(){
        this.isFree=true;
        setVehicle(null);
    }

}
