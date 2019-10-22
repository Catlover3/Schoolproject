package data_access;

import models.Student;

public interface StudentDao {

    public void saveStudent (Student student);
    public void findByEmail (String email);
    public void findByName(String name);
    public void findById(int id);
    public void findAll();
    public void deleteStudent(Student student);
}
