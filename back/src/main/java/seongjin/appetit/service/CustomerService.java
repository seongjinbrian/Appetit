package seongjin.appetit.service;

import seongjin.appetit.dto.CustomerDto;

public interface CustomerService {
    CustomerDto createUser(CustomerDto userDto);
    CustomerDto getUserByUserId(String userId);
}
