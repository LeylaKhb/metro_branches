package com.habibullina.Task1.models.route_list_with_way_points;

import java.util.*;

import com.google.gson.Gson;
import com.habibullina.Task1.models.metro.MetroBranch;
import com.habibullina.Task1.models.metro.MetroStation;
import com.habibullina.Task1.models.user.UserOrder;
// добавить поля в user order
// разобраться с metro branch id
public class RouteListsGenerator {
    private final String rawContent;
    private final Gson gson = new Gson();

    public RouteListsGenerator(String rawContent) {
        this.rawContent = rawContent;
    }

    public Map<String, Object> makeRouteLists() {
        List<UserOrder> userOrders;
        List<MetroBranch> arrayOfMetroBranches;

        Map<String, Object> result;

        InboundData x = gson.fromJson(rawContent, InboundData.class);
        userOrders = x.getUser_orders();
        arrayOfMetroBranches = x.getMetro_branches_dictionary();

        result = generateRouteLists(userOrders, arrayOfMetroBranches);

        return result;
    }

    private Map<String, Object> generateRouteLists(List<UserOrder> userOrders, List<MetroBranch> arrayOfMetroBranches) {
        List<Long> listOfUserOrderId = new ArrayList<>();
        List<Long> listOfUserMetroStationId = new ArrayList<>();

        for (UserOrder userOrder : userOrders) {
            if (userOrder.getUser().getMetroStation() != null) {
                listOfUserOrderId.add(userOrder.getId());
                listOfUserMetroStationId.add(userOrder.getUser().getMetroStation().getId());
            }
        }

        List<Object> listOfMetroBranchesWithWayPoints = new ArrayList<>();
        for (MetroBranch metroBranch : arrayOfMetroBranches) {
            List<Object> wayPoints = new ArrayList<>();
            for (MetroStation metroStation : metroBranch.getMetro_stations()) {
                List<Object> listOfUserOrdersOnMetroStation = new ArrayList<>();
                for (int i = 0; i < listOfUserOrderId.size(); i++) {
                    if (listOfUserMetroStationId.get(i) == metroStation.getId()) {
                        Map<String, Long> userOrderMap = new HashMap<>();
                        userOrderMap.put("id", listOfUserOrderId.get(i));
                        listOfUserOrdersOnMetroStation.add(userOrderMap);
                    }
                }
                if (!listOfUserOrdersOnMetroStation.isEmpty()) {
                    Map<String, Object> metroStationMap = new HashMap<>();
                    metroStationMap.put("id", metroStation.getId());
                    metroStationMap.put("title", metroStation.getTitle());

                    Map<String, Object> metroStationWithUserOrders = new HashMap<>();
                    metroStationWithUserOrders.put("user_orders", listOfUserOrdersOnMetroStation);
                    metroStationWithUserOrders.put("metro_station", metroStationMap);

                    wayPoints.add(metroStationWithUserOrders);
                }
            }
            if (!wayPoints.isEmpty()) {
                Map<String, Object> metroBranchMap = new HashMap<>();
                metroBranchMap.put("id", metroBranch.getId());
                metroBranchMap.put("name", metroBranch.getName());

                Map<String, Object> metroBranchWithWayPoints = new HashMap<>();
                metroBranchWithWayPoints.put("metro_branch", metroBranchMap);
                metroBranchMap.put("waypoints", wayPoints);
                listOfMetroBranchesWithWayPoints.add(metroBranchWithWayPoints);
            }
        }

        Map<String, Object> routeLists = new HashMap<>();
        if (!listOfMetroBranchesWithWayPoints.isEmpty()) {
            routeLists.put("route_lists", listOfMetroBranchesWithWayPoints);
        }
        return routeLists;
    }
}
