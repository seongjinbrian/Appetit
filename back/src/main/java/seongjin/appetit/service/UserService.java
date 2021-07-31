package seongjin.appetit.service;

import seongjin.appetit.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
}
