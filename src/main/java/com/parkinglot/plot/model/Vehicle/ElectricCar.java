package com.parkinglot.plot.model.Vehicle;

import com.parkinglot.plot.model.parking.ParkingTicket;


public class ElectricCar extends Vehicle{
    public ElectricCar(String id, String owner, String vehicleNumber){
       super(VehicleType.ELECTRICCAR,id, owner,vehicleNumber);
    }

    @Override
    void assignTicket(ParkingTicket parkingTicket) {
      setParkingTicket(parkingTicket);
    }
}
