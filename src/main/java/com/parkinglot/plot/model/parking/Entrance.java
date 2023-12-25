package com.parkinglot.plot.model.parking;

import com.parkinglot.plot.model.Vehicle.Vehicle;
import com.parkinglot.plot.model.Vehicle.VehicleType;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public class Entrance {
    private int entranceId;
    private DisplayBoard board;
    private Floor floor;

    public Entrance(int id, DisplayBoard board, Floor floor) {
        this.entranceId = id;
        this.board = board;
        this.floor = floor;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle, String parkingId, Floor floor, Entrance entrance) {

        HashMap<ParkingSpotType, List<ParkingSpot>> allSpotsInFloor = floor.getAllspots();
        VehicleType vehicleType = vehicle.getType();
        ParkingSpotType parkingSpotType = null;
        switch (vehicleType) {
            case CAR:
                parkingSpotType = ParkingSpotType.CAR;
                break;
            case MOTORBIKE:
                parkingSpotType = ParkingSpotType.MOTORBIKE;
                break;
            case EBIKE:
                parkingSpotType = ParkingSpotType.EBIKE;
                break;
            case ELECTRICCAR:
                parkingSpotType = ParkingSpotType.ELECTRIC;
                break;
            case VAN:
                parkingSpotType = ParkingSpotType.LARGE;
                break;
            case TRUCK:
                parkingSpotType = ParkingSpotType.LARGE;
                break;
        }

        DisplayBoard displayBoard = entrance.getBoard();
        int vacancies = displayBoard.getVacancies(parkingSpotType);
        if (vacancies > 0) {
            List<ParkingSpot> vehicleSpots = allSpotsInFloor.get(parkingSpotType);
            ParkingSpot spot = vehicleSpots.stream().filter(ParkingSpot::isFree).collect(Collectors.toList()).get(0);
            ParkingTicket ticket = new ParkingTicket(parkingId, vehicle.getId(),
                    new Date(), floor.getFloorId(), spot.getSpotId(), entrance.getEntranceId(), new Date(), 0, vehicle.getOwner());

            List<DisplayBoard> allDisplayBoards = floor.getDisplayBoards();
            ParkingSpotType finalParkingSpotType = parkingSpotType;
            allDisplayBoards.stream().forEach(board->
            board.updateDisplayBoard(finalParkingSpotType, vacancies - 1));
            return ticket;
        }
        return null;
    }
}


