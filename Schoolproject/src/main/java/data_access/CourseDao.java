package data_access;

import java.time.LocalDate;

import models.Course;
import models.Student;

public interface CourseDao {
    public void saveCourse (Course course);
    public void findById (int id);
    public void findByName(String name);
    public void findByDate(LocalDate date);
    public void findAll();
    public void deleteStudent(Student student);
}
