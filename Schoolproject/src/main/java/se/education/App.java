package se.education;

import data_access.Data_Creation;
import data_access.StudentDaoList;

 public class App {
	 
    public static void main(String[]args) {
    	
    Data_Creation create = new Data_Creation();
    create.createAll();
    
    StudentDaoList studentDAO = new StudentDaoList();
    studentDAO.findAll();
    studentDAO.showAllInformation();
   



    }
    
    
}
