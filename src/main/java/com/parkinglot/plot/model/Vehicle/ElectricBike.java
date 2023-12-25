package com.parkinglot.plot.model.Vehicle;

import com.parkinglot.plot.model.parking.ParkingTicket;
import lombok.Getter;
import lombok.Setter;


public class ElectricBike extends Vehicle{

    public ElectricBike(String id, String owner,String vehicleNumber){
       super(VehicleType.EBIKE,id,owner,vehicleNumber);
    }

    @Override
    void assignTicket(ParkingTicket parkingTicket) {
      setParkingTicket(parkingTicket);
    }
}
