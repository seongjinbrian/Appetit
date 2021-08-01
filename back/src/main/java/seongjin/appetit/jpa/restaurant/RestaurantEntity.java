package seongjin.appetit.jpa.restaurant;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import seongjin.appetit.dto.restaurant.RestaurantDto;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name= "restaurants")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(nullable = false, name="restaurant_name")
    private String restaurant_name;
    @Column(nullable = false, name="delivery_type")
    @Enumerated(EnumType.STRING)
    private DeliveryType delivery_type;
    @Column(nullable = false, name="tel", unique = true)
    private String tel;
    @Column(nullable = false, name="info")
    private String info;
    @Column(nullable = false, name="biz_number", unique = true)
    private String biz_number;
    @Column(nullable = false, name="min_pay")
    private String min_pay;
//    @Column(name="created_at")
//    private LocalDateTime createdAt = LocalDateTime.now();
//    @Column(name="updated_at")
//    private LocalDateTime updatedAt = Loca
    @Column(nullable = false, name="payment_type")
    @Enumerated(EnumType.STRING)
    private PaymentType payment_type;
    @Column(nullable = false, name="work_status")
    @Enumerated(EnumType.STRING)
    private WorkStatus work_status;

    public enum DeliveryType {
        RIDER_DELIVERY, TAKEOUT
    }
    public enum PaymentType {
        APP_PAYMENT, RIDER_PAYMENT
    }
    public enum WorkStatus {
        OPEN, CLOSE
    }
}
