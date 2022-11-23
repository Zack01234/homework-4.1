package school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByAge(Long age);

    List<Student> findAllByAgeBetween(Long minAge, Long maxAge);
}
