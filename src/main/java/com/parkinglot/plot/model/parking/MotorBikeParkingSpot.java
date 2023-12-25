package com.parkinglot.plot.model.parking;

public class MotorBikeParkingSpot extends ParkingSpot{

    public MotorBikeParkingSpot(int spotId, Floor floorId)
    {
        super(spotId,floorId,ParkingSpotType.MOTORBIKE);
    }
}
