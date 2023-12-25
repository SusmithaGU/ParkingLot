package com.parkinglot.plot.model.parking;


import com.parkinglot.plot.model.Vehicle.VehicleType;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;


public class ParkingLot {

  @Getter private HashMap<VehicleType,Integer> parkingRates ;

  public ParkingLot(){
      HashMap<VehicleType,Integer> map=new HashMap<>();
      map.put(VehicleType.CAR,50);
      map.put(VehicleType.TRUCK,45);
      map.put(VehicleType.VAN,40);
      map.put(VehicleType.EBIKE,40);
      map.put(VehicleType.MOTORBIKE,35);
      map.put(VehicleType.ELECTRICCAR,45);
      parkingRates=map;
  }

}
