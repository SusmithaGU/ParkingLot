package com.parkinglot.plot.model.parking;

public class ElectricBikeParkingSpot extends ParkingSpot{

    public ElectricBikeParkingSpot(int spotId, Floor floorId){

        super(spotId,floorId,ParkingSpotType.EBIKE);
    }
}
