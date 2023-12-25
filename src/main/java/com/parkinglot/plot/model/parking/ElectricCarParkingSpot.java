package com.parkinglot.plot.model.parking;

public class ElectricCarParkingSpot extends ParkingSpot{

    public ElectricCarParkingSpot(int spotId, Floor floorId){

        super(spotId,floorId,ParkingSpotType.ELECTRIC);
    }
}
