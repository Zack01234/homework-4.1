package school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.entity.Faculty;

import java.util.List;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    List<Faculty> getAllFacultiesByColorOrName(String color, String name);
}
