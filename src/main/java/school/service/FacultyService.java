package school.service;

import org.springframework.stereotype.Service;
import school.entity.Faculty;
import school.entity.Student;
import school.repository.FacultyRepository;

import java.util.Collection;

@Service
public class FacultyService {
    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty getFacultyById(Long id) {
        return facultyRepository.findById(id).get();
    }

    public Faculty addFaculty(Faculty faculty) {
        faculty.setId(0L);
        return facultyRepository.save(faculty);
    }

    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> getAllFacultiesByColorOrName(String color, String name) {
        return facultyRepository.getAllFacultiesByColorOrName(color, name);
    }

    public Collection<Faculty> findAllFaculties() {
        return facultyRepository.findAll();
    }

    public Collection<Student> getAllStudentsById(Long id) {
        return facultyRepository.findById(id).get().getStudents();
    }
}
