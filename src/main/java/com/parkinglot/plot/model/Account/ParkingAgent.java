package com.parkinglot.plot.model.Account;

import com.parkinglot.plot.model.parking.Floor;
import lombok.Data;

@Data
public class ParkingAgent {
    private String name;
    private String id;
    private Floor floor;
}
