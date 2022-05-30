package testgit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testgit.demo.model.Student;
@Repository
public interface StudentBReopository  extends JpaRepository<Student, Long> {
}
