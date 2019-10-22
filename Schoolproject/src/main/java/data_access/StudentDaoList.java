package data_access;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import models.Student;

public class StudentDaoList implements StudentDao{
	
	static private ArrayList<Student> studentList = new ArrayList<Student>();
	Iterator<Student> itr = studentList.iterator();
	
	//Stream<S> filter(Predicate<? super S> predicate)

    public void showAllInformation(){
		List<Student> studentsStream = studentList
				  .stream()
				  .filter(c -> c.getId() > 1)
				  .peek(System.out::println)
				  .collect(Collectors.toList());
    	
    }
    
    @Override
    public void findAll() {
  	  while(itr.hasNext()) {
  		  System.out.println(itr.next()); 
  	  }
    }

  
    @Override
    public void saveStudent(Student student) {
    	studentList.add(student);
    }
    

    @Override
    public void findByEmail(String email) {
    	  for(Student loop : studentList) {
    		  if(loop.getEmail() == email) {
    			  System.out.println(loop);
    		  }
      		  
      	  }
 

    }

    @Override
    public void findByName(String name) {
  	  for(Student loop : studentList) {
		  if(loop.getName() == name) {
			  System.out.println(loop);
		  }
  	  }  
    }

    @Override
    public void findById(int id) {
    	  for(Student loop : studentList) {
    		  if(loop.getId() == id) {
    			  System.out.println(loop);
    		  }
      	  }  
    }

    @Override
    public void deleteStudent(Student student) {
		  studentList.remove(studentList.indexOf(student));
 
    }


}
