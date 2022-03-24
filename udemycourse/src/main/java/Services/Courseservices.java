package Services;

import com.ps.domain.Course;
import com.ps.respository.CourseRepository;
import com.ps.respository.Courserespositoryimplement;

import javax.naming.NamingException;
import java.sql.SQLException;

public class Courseservices {
    public Course CreateCourse (Course course) throws SQLException, NamingException {
        CourseRepository course_imp = new Courserespositoryimplement();
        return  course_imp.create(course);

    }
}
