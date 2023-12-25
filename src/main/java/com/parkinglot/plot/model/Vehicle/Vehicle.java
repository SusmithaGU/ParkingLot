package com.parkinglot.plot.model.Vehicle;

import com.parkinglot.plot.model.parking.ParkingTicket;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class Vehicle {
   private VehicleType type;
   private String VehicleNumber;
   private ParkingTicket parkingTicket;
   private String id;
   private String owner;

   public Vehicle(VehicleType type,String id, String owner,String vehicleNumber) {
      this.type = type;
      this.id = id;
      this.owner = owner;
      this.VehicleNumber=vehicleNumber;
   }

   abstract void assignTicket(ParkingTicket parkingTicket);
}
