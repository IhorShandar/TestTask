package java;

import java.model.Grade;
import java.model.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * GlobalLogicTraining is an implementation of the {Training} interface.
 * Contains the training name and student grades.
 */
public class GlobalLogicTraining implements Training {

    /**
     * TODO: implement methods of the Training interface and add the necessary functionality
     */

    private final String name;

    private final HashMap<Student, Grade> grades = new HashMap<>();

    public GlobalLogicTraining(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(grades.keySet());
    }

    @Override
    public boolean addStudent(Student student) {
        if (!grades.containsKey(student)){
            grades.put(student, new Grade());
            return true;
        }
        return false;
    }

    @Override
    public boolean removeStudent(Student student) {
        if (grades.containsKey(student)){
            grades.remove(student);
            return true;
        }
        return false;
    }

    @Override
    public boolean rateFirstSemester(Student student, int mark) {
        if (grades.containsKey(student)){
            grades.get(student).setFirstSemester(mark);
            return true;
        }
        return false;
    }

    @Override
    public boolean rateSecondSemester(Student student, int mark) {
        if (grades.containsKey(student)){
            grades.get(student).setSecondSemester(mark);
            return true;
        }
        return false;
    }

    @Override
    public boolean isPresent(Student student) {
        return grades.containsKey(student);
    }

    @Override
    public Optional<Grade> getStudentGrade(Student student) {
        return Optional.of(grades.get(student));
    }
}
