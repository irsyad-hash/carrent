package syadtom.carrent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import syadtom.carrent.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
}

