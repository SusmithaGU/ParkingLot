package com.parkinglot.plot.model.parking;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class Floor {
    private int floorId;
    private List<Entrance> entranceList;
    private List<Exit> exitsList;
    private HashMap<ParkingSpotType, List<ParkingSpot>> Allspots;

    private List<DisplayBoard> displayBoards;

    public Floor(int id, List<Entrance> entrances, List<Exit> exits,List<DisplayBoard> displayBoards) {
        this.floorId = id;
        this.entranceList = entrances;
        this.exitsList = exits;
        this.displayBoards=new ArrayList<>();
    }


    public void addParkingSpots() {
        HashMap<ParkingSpotType, List<ParkingSpot>> map = new HashMap<>();
        map.put(ParkingSpotType.CAR, new ArrayList<>());
        map.put(ParkingSpotType.ELECTRIC, new ArrayList<>());
        map.put(ParkingSpotType.EBIKE, new ArrayList<>());
        map.put(ParkingSpotType.HANDICAPPED, new ArrayList<>());
        map.put(ParkingSpotType.MOTORBIKE, new ArrayList<>());
        setAllspots(map);
    }

    public void addParkingSpotsForType(List<ParkingSpot> spots, ParkingSpotType type) {
        HashMap<ParkingSpotType, List<ParkingSpot>> allspots = getAllspots();
        if (allspots.isEmpty()) {
            List<ParkingSpot> currSpots = allspots.get(type);
            currSpots.addAll(spots);
            allspots.put(type, currSpots);
            setAllspots(allspots);
        }
    }

    public void addNewParkingSpotForType(ParkingSpot spot, ParkingSpotType type) {
        HashMap<ParkingSpotType, List<ParkingSpot>> allspots = getAllspots();
        if (!allspots.isEmpty()) {
            List<ParkingSpot> currSpots = allspots.get(type);
            currSpots.add(spot);
            allspots.put(type, currSpots);
            setAllspots(allspots);
        }
    }
}
