package com.habibullina.Task1.controllers;

import com.habibullina.Task1.models.route_list_with_way_points.RouteListsGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class FlowController {

    @PostMapping("/")
    public @ResponseBody Map<String, Object> index(@RequestBody String req) {
        RouteListsGenerator generator = new RouteListsGenerator(req);
        return generator.makeRouteLists();
    }
}
