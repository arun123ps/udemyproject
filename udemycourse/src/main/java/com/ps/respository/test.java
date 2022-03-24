package com.ps.respository;

import com.ps.domain.Course;

import javax.naming.NamingException;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException, NamingException {
        Courserespositoryimplement cs= new Courserespositoryimplement();
        Course course = new Course(1, "Learn Python:The complete python programming course", "Avinash Jain", "Learn A-Z everything about Python, from the basics, to advanced topics like Python GUI, Python Data Analysis, and more!Create their own Python ProgramsBecome an experienced Python ProgrammerParse the Web and Create their own Games", "Python", "https://image","2022-09-12",2000,25000,2000,false,250,400,"Begin");
        Course course1 = cs.create(course);
        System.out.println(course1);
    }
}
