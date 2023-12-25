package com.parkinglot.plot.model.parking;

import com.parkinglot.plot.model.Vehicle.Vehicle;
import com.parkinglot.plot.model.Vehicle.VehicleType;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class DisplayBoard {
    private int id;
    private int floorId;
    private int entranceId;
    private HashMap<ParkingSpotType, Integer> board;

    DisplayBoard(int id, int floorId,int entranceId,HashMap<ParkingSpotType, Integer> board) {
        this.board = board;
        this.id = id;
        this.floorId=floorId;
        this.entranceId=entranceId;
    }
    public int getVacancies(ParkingSpotType type){
       return board.get(type);
    }
    //update vacancies
    public void updateDisplayBoard(ParkingSpotType type, int vacancies) {
        if (board == null) {
            board = new HashMap<>();
        }
        board.put(type, vacancies);
    }
}