package syadtom.carrent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import syadtom.carrent.model.Rent;

public interface RentRepository extends JpaRepository<Rent, Integer> {
}
