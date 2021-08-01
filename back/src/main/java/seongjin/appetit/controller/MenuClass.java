package seongjin.appetit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import seongjin.appetit.vo.Greeting;

@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping("/menu")
public class MenuClass {

    private Environment env;

    @Autowired
    private Greeting greeting;

//    @Autowired
//    public MenuClass(Environment env) {
//        this.env = env;
//    }

    @GetMapping("/health_check")
    public ResponseEntity welcome() {
        return ResponseEntity.status(HttpStatus.CREATED).body("it's actually working");
    }

    @GetMapping("/welcome")
    public ResponseEntity getMenu() {
        return ResponseEntity.status(HttpStatus.OK).body(greeting.getMessage());
    }
//    @PostMapping("/users")
//    public ResponseEntity<ResponseUser> createUser(@RequestBody RequestUser user) {
//        ModelMapper mapper = new ModelMapper();
//        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//
//        UserDto userDto = mapper.map(user, UserDto.class);
//        userService.createUser(userDto);
//
//        ResponseUser responseUser = mapper.map(userDto, ResponseUser.class);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(responseUser);
//    }
}
