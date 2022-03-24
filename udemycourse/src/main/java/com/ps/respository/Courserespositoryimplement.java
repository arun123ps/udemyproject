package com.ps.respository;

import com.ps.domain.Course;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Courserespositoryimplement implements CourseRepository{
 public Course create(Course course) throws SQLException, NamingException {
//     DataSource ds = DBconnectionmanager.getDataSource();
     try (
//            Connection connection = ds.getConnection();
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/udemycourse?user=root&password=1234");
     PreparedStatement statement = connection.prepareStatement("INSERT INTO course values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");) {
         statement.setInt(1, course.getId());
         statement.setString(2, course.getAuthor());
         statement.setString(3, course.getDesciption());
         statement.setString(4, course.getCategory());
         statement.setString(5, course.getImageurl());
         statement.setString(6, course.getLastupdatedate());
         statement.setInt(7, course.getRating());
         statement.setInt(8, course.getNumberofrating());
         statement.setBoolean(9, course.isBestseller());
         statement.setString(10, course.getTitle());
         statement.setInt(11, course.getDiscountprice());
         statement.setInt(12, course.getOriginalprice());
         statement.setInt(13, course.getFixedprice());
         statement.setString(14, course.getLevel());

         int count = statement.executeUpdate();
         if (count > 0) return course;
     }
     return course;
 }
}


