package school.service;

import org.springframework.stereotype.Service;
import school.entity.Faculty;
import school.entity.Student;
import school.repository.FacultyRepository;
import school.repository.StudentRepository;

import java.util.Collection;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
//    private final FacultyRepository facultyRepository;

    public StudentService(StudentRepository studentRepository, FacultyRepository facultyRepository) {
        this.studentRepository = studentRepository;
//        this.facultyRepository = facultyRepository;
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student addStudent(Student student) {
        student.setId(0L);
        return studentRepository.save(student);
    }

    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Collection<Student> getAllStudentsByAge(Long age) {
        return studentRepository.findAllByAge(age);
    }

    public Collection<Student> findByAgeBetween(Long min, Long max) {
        return studentRepository.findAllByAgeBetween(min, max);
    }

    public Collection<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Faculty getStudentsFacultyByStudentsId(Long id) {
        return studentRepository.findById(id).get().getFaculty();
    }
}
