package seongjin.appetit.service.user;

import seongjin.appetit.dto.user.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
}
