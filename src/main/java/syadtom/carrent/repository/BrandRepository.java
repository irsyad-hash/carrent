package syadtom.carrent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import syadtom.carrent.model.Brand;

public interface BrandRepository extends JpaRepository<Brand , Integer> {
}
