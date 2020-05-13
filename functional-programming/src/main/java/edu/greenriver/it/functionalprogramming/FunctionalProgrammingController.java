package edu.greenriver.it.functionalprogramming;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

@Controller
public class FunctionalProgrammingController {


    private Map<String, String[]> words = new HashMap<>();
    private Map<String, int[]> numbers = new HashMap<>();

    public FunctionalProgrammingController() {

        words.put("favorite", new String[]{"apple", "banana", "candy", "basketball", "LeBron", "Kobe", "mamba"});

        words.put("days", new String[]{"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"});
    }


    /**
     * First problem
     *
     * @return
     */
    @RequestMapping("/one")
    @ResponseBody
    public StringBuilder problem1(Model model) {
        StringBuilder word = new StringBuilder();
        String[] favs = words.get("favorite");
        for (String fav : favs) {
            word.append(fav).append("\n");
            System.out.println(word.reverse().toString());
        }
        return word;
    }

    @RequestMapping("/2")
    @ResponseBody
    public Stream<String> problem2(Model model) {
        String[] dayz = words.get("days");
        Stream<String> dayzs = Arrays.stream(dayz).filter(s -> {
            return s.substring(0, 1).chars().count() > 0;
        });

        model.addAttribute("days", dayz);
        return Arrays.stream(dayz).distinct();
    }

    @RequestMapping("/3")
    @ResponseBody
    public int[] problem3() {
        Random rand = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            int n = rand.nextInt(100);
            randomNumbers[i] = n;
            System.out.println(randomNumbers[i]);
        }
        return Arrays.stream(randomNumbers).distinct().toArray();
    }
}