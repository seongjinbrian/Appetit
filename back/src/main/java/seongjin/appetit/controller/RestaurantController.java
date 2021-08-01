package seongjin.appetit.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import seongjin.appetit.dto.UserDto;
import seongjin.appetit.dto.restaurant.RestaurantDto;
import seongjin.appetit.vo.ResponseUser;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    private Environment env;
//    private
    @Autowired
    public RestaurantController(Environment env) {
        this.env = env;
    }

    @GetMapping
    public ResponseEntity addRestaurant(@RequestBody RestaurantDto restaurant) {
//        shop
        return ResponseEntity.status(HttpStatus.CREATED).body("Hi");
    }


}
