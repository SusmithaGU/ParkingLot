package com.parkinglot.plot.model.parking;

public class CappedParkingSpot extends ParkingSpot{

    public CappedParkingSpot(int spotId, Floor floorId){
        super(spotId,floorId,ParkingSpotType.HANDICAPPED);
    }
}
