package seongjin.appetit.jpa.user;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name= "users")
public class UserEntity {
    // database에 정의 될 column
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(nullable = false, name="email", unique = true)
    private String email;
    @Column(nullable = false, name="name")
    private String name;
    @Column(nullable = false, name="user_id", unique = true)
    private String userId;
    @Column(nullable = false, unique = true, name="encrypted_pwd")
    private String encryptedPwd;
}

