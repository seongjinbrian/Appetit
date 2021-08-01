package seongjin.appetit.service.restaurant;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seongjin.appetit.dto.restaurant.RestaurantDto;
import seongjin.appetit.dto.user.UserDto;
import seongjin.appetit.jpa.restaurant.RestaurantEntity;
import seongjin.appetit.jpa.restaurant.RestaurantRepository;

@Service
@Slf4j
public class RestaurantServiceImpl implements RestaurantService{
    RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }
    @Override
    public RestaurantDto createRestaurant(RestaurantDto restaurantDto) {
        ModelMapper mapper = new ModelMapper();
        RestaurantEntity restaurantEntity = mapper.map(restaurantDto, RestaurantEntity.class);
        log.info(String.valueOf(restaurantEntity));
        restaurantEntity.setId(1);
        restaurantRepository.save(restaurantEntity);
        return null;
//        RestaurantDto returnUserDto = mapper.map(restaurantEntity, RestaurantDto.class);
//        return returnUserDto;
    }
}
