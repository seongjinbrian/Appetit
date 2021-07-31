package seongjin.appetit.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerDto {
    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createdAt;
}
