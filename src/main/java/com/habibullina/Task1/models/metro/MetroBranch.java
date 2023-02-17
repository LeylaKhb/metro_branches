package com.habibullina.Task1.models.metro;


import java.util.ArrayList;

public class MetroBranch {
    private long id;
    private String name;
    private ArrayList<MetroStation> metro_stations;


    @Override
    public String toString() {
        return "MetroBranch{" +
                "metroStations=" + metro_stations +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<MetroStation> getMetro_stations() {
        return metro_stations;
    }
}

