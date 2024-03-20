package hu.flow.user.repository;

import hu.flow.user.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    public List<Users> findByName(String name);

    public List<Users> findByPointsGreaterThan(int points);
}
