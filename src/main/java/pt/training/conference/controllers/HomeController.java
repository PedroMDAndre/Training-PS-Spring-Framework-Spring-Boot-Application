package pt.training.conference.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping(value = "/")
    public Map<String, String> getStatus() {
        Map<String, String> map = new HashMap<>();
        map.put("appVersion", appVersion);
        return map;
    }
}
