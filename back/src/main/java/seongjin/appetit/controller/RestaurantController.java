package seongjin.appetit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import seongjin.appetit.dto.restaurant.RestaurantDto;
import seongjin.appetit.service.restaurant.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    private Environment env;
    private RestaurantService restaurantService;

    @Autowired
    public RestaurantController(Environment env, RestaurantService restaurantService) {
        this.env = env;
        this.restaurantService = restaurantService;
    }

    @PostMapping
    public ResponseEntity addRestaurant(@RequestBody RestaurantDto restaurant) {
        // shop
        restaurantService.createRestaurant(restaurant);
        return ResponseEntity.status(HttpStatus.CREATED).body("success");
    }


}
