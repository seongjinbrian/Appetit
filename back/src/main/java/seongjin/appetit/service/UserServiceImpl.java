package seongjin.appetit.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seongjin.appetit.dto.UserDto;
import seongjin.appetit.jpa.UserEntity;
import seongjin.appetit.jpa.UserRepository;

import java.util.UUID;

@Service
@Slf4j
public class UserServiceImpl implements UserService{
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDto createUser(UserDto userDto) {
        userDto.setUserId(UUID.randomUUID().toString());

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = mapper.map(userDto, UserEntity.class);
//        log.info(String.valueOf(userEntity));
        userEntity.setEncryptedPwd("encrypted_password");
//        userEntity.setId(1);
        log.info(String.valueOf(userEntity));
        userRepository.save(userEntity);
//        log.info(String.valueOf(userEntity));
        UserDto returnUserDto = mapper.map(userEntity, UserDto.class);
        return returnUserDto;
    }

    @Override
    public UserDto getUserByUserId(String userId) {
        return null;
    }
}
