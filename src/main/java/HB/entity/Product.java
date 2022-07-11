package HB.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "price", nullable = false)
    private int price;
    @Column(name="img_name", unique = true, nullable = false)
    private String imgName;

}
