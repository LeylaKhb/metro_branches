package com.habibullina.Task1.models.user;

import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.Map;

public class UserOrder {
    private long id;
    private User user;


    @Override
    public String toString() {
        return "UserOrder{" +
                "id=" + id +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public long getId() {
        return id;
    }
}
