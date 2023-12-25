package com.parkinglot.plot.model.parking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ParkingTicket {
    private String id;
    private String vehileId;
    private Date startTime;
    private int floorId;
    private int spotId;
    private int entranceId;
    private Date endTime;
    private double charges;
    private String owner;
}
