package com.parkinglot.plot.model.Vehicle;

import com.parkinglot.plot.model.parking.ParkingTicket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Van extends Vehicle{
    public Van(String id, String owner,String vehicleNumber){
        super(VehicleType.VAN,id, owner,vehicleNumber);
    }

    @Override
    void assignTicket(ParkingTicket parkingTicket) {
      setParkingTicket(parkingTicket);
    }
}
