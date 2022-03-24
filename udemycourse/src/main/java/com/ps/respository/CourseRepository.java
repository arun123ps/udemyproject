package com.ps.respository;

import com.ps.domain.Course;

import javax.naming.NamingException;
import java.sql.SQLException;

public interface CourseRepository {
    public Course create (Course course) throws SQLException, NamingException;
}
