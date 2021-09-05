package java.comparator;

import java.model.Student;
import java.util.Comparator;

/**
 * Custom comparator for the {Student} class
 */
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        if (student.lastName.compareTo(t1.lastName) != 0){
            return student.lastName.compareTo(t1.lastName);
        }
        return student.firstName.compareTo(t1.firstName);
    }

    /**
     * TODO: implement `compare` method of the Comparator interface
     * Compare students in natural order by the last name. If last names are the same,
     * compare in natural order by the first name
     */

}
