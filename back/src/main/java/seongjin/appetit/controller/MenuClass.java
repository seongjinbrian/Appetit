package seongjin.appetit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping("/menu")
public class MenuClass {

    @GetMapping("/welcome")
    public ResponseEntity getMenu() {
        return new ResponseEntity("menu",HttpStatus.OK);
    }

}
