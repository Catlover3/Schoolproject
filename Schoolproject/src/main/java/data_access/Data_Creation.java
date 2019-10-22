package data_access;

import models.Course;
import models.Student;

import java.time.LocalDate;

public class Data_Creation {
	
	StudentDaoList studDao = new StudentDaoList();

    public void createAll() {
    	
    
    Student Anders1 = new Student(1, "Anders", "anders@gmail.com", "Storgatan 52" );
    Student Karl2 = new Student(2, "Karl", "karl@hotmail.com", "Liljevägen 23");
    studDao.saveStudent(Anders1);
    studDao.saveStudent(Karl2);
    
    
        LocalDate customDate = null;
        LocalDate customDate2 = null;
        try {
            customDate = LocalDate.parse("2019-09-09");
            customDate2 = LocalDate.parse("2019-01-04");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Course Engineering = new Course(1, "Engineering", customDate, 26);
        Course Economics = new Course(2, "Economics", customDate2 ,  14);

    Engineering.addNewStudent(Anders1);
    Engineering.addNewStudent(Karl2);
    Economics.addNewStudent(Karl2);

    
    
    }


}
