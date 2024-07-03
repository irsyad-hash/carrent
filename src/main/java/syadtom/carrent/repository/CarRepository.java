package syadtom.carrent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import syadtom.carrent.model.Car;

public interface CarRepository extends JpaRepository<Car,Integer> {
}
