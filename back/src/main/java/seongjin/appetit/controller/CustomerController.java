package seongjin.appetit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import seongjin.appetit.service.CustomerService;

@RestController
@RequestMapping("/")
public class CustomerController {
    private Environment env;
    private CustomerService customerService;

    @Autowired
    public CustomerController(Environment env, CustomerService customerService) {
        this.env = env;
        this.customerService = customerService;
    }
}
