package seongjin.appetit.dto.restaurant;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Data
public class RestaurantDto {
    public enum DeliveryType {
        RIDER_DELIVERY, TAKEOUT
    }
    public enum PaymentType {
        APP_PAYMENT, RIDER_PAYMENT
    }
    public enum WorkStatus {
        OPEN, CLOSE
    }
    // Restaurant Name
    private String restaurant_name;
    // Delivery type
    @Enumerated(EnumType.STRING)
    private DeliveryType delivery_type;
    // Restaurant telephone number
    private String tel;
    // introduction
    private String info;
    // Business number
    private String biz_number;
    // Minimum Price to pay to order foods
    private String min_pay;
    // Ordered time
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
    // Payment Method
    @Enumerated(EnumType.STRING)
    private PaymentType payment_type;
    // Restaurant OPEN or CLOSED
    @Enumerated(EnumType.STRING)
    private WorkStatus work_status;
}
