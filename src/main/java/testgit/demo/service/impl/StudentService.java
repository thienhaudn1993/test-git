package testgit.demo.service.impl;

import org.springframework.stereotype.Service;
import testgit.demo.model.Student;
import testgit.demo.service.IStudentService;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Override
    public List<Student> getAll() {
        return null;
    }
}
