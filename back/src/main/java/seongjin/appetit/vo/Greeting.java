package seongjin.appetit.vo;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // 빈 등록, 타입 기반의 자동주입 어노테이션: @Autowired, @Resource와 비슷한 기능을 수행한다. +싱글톤임. parameter에 이름지정 가능
@Data // @Getter + @Setter + @EqualsAndHashCode + @ToString
public class Greeting {
    @Value("${greeting.message}")
    private String message;
}
