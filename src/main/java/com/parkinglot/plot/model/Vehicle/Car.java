package com.parkinglot.plot.model.Vehicle;

import com.parkinglot.plot.model.parking.ParkingTicket;
import lombok.Getter;
import lombok.Setter;


public class Car extends Vehicle{
    public Car(String id, String owner,String vehicleNumber){
       super(VehicleType.CAR,id, owner,vehicleNumber);
    }

    @Override
    void assignTicket(ParkingTicket parkingTicket) {
      setParkingTicket(parkingTicket);
    }
}
