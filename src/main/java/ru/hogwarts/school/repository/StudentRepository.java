package ru.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school.entity.Student;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findAllByAgeBetween(Long min, Long max);

    Student findAllByAge(Long age);
    List<Student> findByAgeBetween(Long min, Long max);

    @Query(value = "select count(*) from student", nativeQuery = true)
    Long getStudentsCount();

    @Query(value = "select avg(age) from student", nativeQuery = true)
    Long getStudentsAgeAvg();

    @Query(value = "select * from student order by id desc limit 10", nativeQuery = true)
    List<Student> getLastTenStudents();
}
