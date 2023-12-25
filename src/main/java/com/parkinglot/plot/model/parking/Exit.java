package com.parkinglot.plot.model.parking;

import com.parkinglot.plot.model.Vehicle.Vehicle;
import com.parkinglot.plot.model.Vehicle.VehicleType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class Exit {
    private String exitId;
    private Floor floor;

    private ParkingLot parkingLot;

    public Exit(String exitId, Floor floor) {
        this.exitId = exitId;
        this.floor = floor;
        this.parkingLot = getParkingLot();
    }

    public double vacateAndCharge(ParkingSpot spot, Floor floor, Exit exit, Vehicle vehicle, ParkingTicket ticket) {

        double amount = calculateCharges(vehicle, spot, ticket);
        spot.vacateSpot();
        DisplayBoard displayBoard = floor.getDisplayBoards().get(0);
        int vacancies = displayBoard.getVacancies(spot.getType());
        List<DisplayBoard> allDisplayBoards = floor.getDisplayBoards();
        ParkingSpotType finalParkingSpotType = spot.getType();
        allDisplayBoards.stream().forEach(board ->
                board.updateDisplayBoard(finalParkingSpotType, vacancies + 1));
        return amount;
    }

    private double calculateCharges(Vehicle vehicle, ParkingSpot spot, ParkingTicket ticket) {
        HashMap<VehicleType, Integer> parkingRates = parkingLot.getParkingRates();
        int rate = parkingRates.get(vehicle.getType());
        Date startTime = ticket.getStartTime();
        long hours = System.currentTimeMillis() - startTime.getTime();
        return hours * rate;
    }
}
