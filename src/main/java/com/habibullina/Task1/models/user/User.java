package com.habibullina.Task1.models.user;

import com.habibullina.Task1.models.metro.MetroStation;

public class User {
    private long id;
    private MetroStation metro_station;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", metroStation=" + metro_station +
                '}';
    }

    public long getId() {
        return id;
    }

    public MetroStation getMetroStation() {
        return metro_station;
    }
}
