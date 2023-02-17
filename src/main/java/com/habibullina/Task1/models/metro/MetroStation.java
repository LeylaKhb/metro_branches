package com.habibullina.Task1.models.metro;

import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class MetroStation {
    private long id;
    private String title;


    @Override
    public String toString() {
        return "MetroStation{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MetroStation)) return false;
        MetroStation that = (MetroStation) o;
        return id == that.id && Objects.equals(title, that.title);
    }

}

