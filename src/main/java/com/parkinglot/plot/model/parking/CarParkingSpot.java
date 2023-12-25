package com.parkinglot.plot.model.parking;

public class CarParkingSpot extends ParkingSpot{

    public CarParkingSpot(int spotId,Floor floorId){
        super(spotId,floorId,ParkingSpotType.CAR);
    }
}
