package com.habibullina.Task1.models.route_list_with_way_points;

import com.habibullina.Task1.models.metro.MetroBranch;
import com.habibullina.Task1.models.user.UserOrder;

import java.util.List;

public class InboundData {
    public List<UserOrder> user_orders;
    public List<MetroBranch> metro_branches_dictionary;

    @Override
    public String toString() {
        return user_orders.toString();
    }

    public List<UserOrder> getUser_orders() {
        return user_orders;
    }

    public List<MetroBranch> getMetro_branches_dictionary() {
        return metro_branches_dictionary;
    }
}
