package syadtom.carrent.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private Boolean available;
    private Integer price;

//    @OneToMany//    private List<Car> details = new ArrayList<>();
//
//    @ManyToOne
//    @JoinColumn(name="brand_id")
//    private Brand brand;
}

