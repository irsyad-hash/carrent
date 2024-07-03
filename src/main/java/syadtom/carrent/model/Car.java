package syadtom.carrent.model;
import jakarta.persistence.*;
import lombok.*;


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
    private Integer id;
    private String name;
    private Boolean available;
    private Integer price;

    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;
}

