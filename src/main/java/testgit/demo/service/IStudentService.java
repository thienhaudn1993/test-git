package testgit.demo.service;

import testgit.demo.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();
    Student save(Student student);
}
