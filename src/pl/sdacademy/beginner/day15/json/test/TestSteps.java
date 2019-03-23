package pl.sdacademy.beginner.day15.json.test;

import java.util.Arrays;
import java.util.List;

public class TestSteps {
    String type = "REST request";
    String method = "GET";
    String URI = "http://google.com/";
    List<Assertions> validStstusCode = Arrays.asList(new Assertions(200), new Assertions(300));
}

