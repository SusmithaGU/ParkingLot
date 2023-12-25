package com.parkinglot.plot.model.Vehicle;

import com.parkinglot.plot.model.parking.ParkingTicket;
import lombok.Getter;
import lombok.Setter;

public class MotorBike extends Vehicle{
    public MotorBike(String id, String owner,String vehicleNumber){
        super(VehicleType.MOTORBIKE,id, owner,vehicleNumber);
    }

    @Override
    void assignTicket(ParkingTicket parkingTicket) {
      setParkingTicket(parkingTicket);
    }
}
