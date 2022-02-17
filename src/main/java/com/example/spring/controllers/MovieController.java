package com.example.spring.controllers;
import com.example.spring.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/")
    public String index(){
        return "Welcome this appplication can get you a movie from a list";
    }

    @GetMapping("/getFirst")
    public String getFirst(){
        return "The first movie on the list is " + MovieService.getFirstMovie();
    }

    @GetMapping("/getRandom")
    public String getRandom(){
        return "Here is a random movie " + MovieService.getRandomMovie();
    }
fghfg
    @GetMapping("/getTenSortByPopularity")
    public String getTenSortByPopularity() {
        return MovieService.getTenSortByPopularityList();
    }
}
