package syadtom.carrent.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rent")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean completed;
    private Date started_at;
    private Date end_at;
    private Integer price;

//    @ManyToOne
//    @JoinColumn(name="car_id")
//    private Car car;
//
//    @ManyToOne
//    @JoinColumn(name="user_id")
//    private Users users;
}
