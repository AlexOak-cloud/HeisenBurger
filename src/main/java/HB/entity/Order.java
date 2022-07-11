package HB.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "price", nullable = false)
    private int price;
    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;

}
