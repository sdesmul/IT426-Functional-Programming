package edu.greenriver.it.functionalprogramming;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

public class FunctionalProgrammingController {


    private Map<String, String[]> words = new HashMap<>();
    private Map<String, int[]> numbers = new HashMap<>();


    public FunctionalProgrammingController() {

        words.put("favorite", new String[]{"apple", "banana", "candy", "basketball", "LeBron", "Kobe", "mamba"});

        words.put("days", new String[]{"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"});

        numbers.put("numbers", new int[10]);

    }


    @RequestMapping("/problem/1")
    @ResponseBody
    public String problem1() {
        return "";
    }

    @RequestMapping("/problem/2")
    @ResponseBody
    public String problem2() {
        return "";
    }

    @RequestMapping("/problem/3")
    @ResponseBody
    public String problem3() {
        return "";
    }

}
