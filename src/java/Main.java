package java;

import java.model.Address;
import java.model.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Address address = Address.builder()
                .city("City")
                .country("Country")
                .houseNumber(23)
                .street("Pidhirna")
                .build();

        Student student = Student.builder("my_email@gmail.com")
                .firstName("Ihor")
                .lastName("Shan")
                .phoneNumber("+38099")
                .address(address)
                .build();

        Student student1 = Student.builder("my_email1@gmail.com")
                .firstName("Ihor1")
                .lastName("Shan")
                .phoneNumber("+380991")
                .address(Address.builder().country("UA").city("Lviv").build())
                .build();

        Student student2 = Student.builder("my_email2@gmail.com")
                .firstName("Ihor2")
                .lastName("Shan2")
                .phoneNumber("+380991")
                .address(Address.builder().country("UA").city("Lviv").build())
                .build();

        Student student3 = Student.builder("my_email3@gmail.com")
                .firstName("Ihor3")
                .lastName("Shan3")
                .phoneNumber("+380991")
                .address(Address.builder().country("UA").city("Lviv").build())
                .build();

        GlobalLogicTraining gl = new GlobalLogicTraining("JavaCourse");
        gl.addStudent(student);
        gl.rateFirstSemester(student, 4);
        gl.rateSecondSemester(student, 5);
        gl.addStudent(student1);
        gl.rateFirstSemester(student1, 4);
        gl.rateSecondSemester(student1, 4);

        GlobalLogicTraining gl2 = new GlobalLogicTraining("C#Course");
        gl2.addStudent(student1);
        gl2.rateFirstSemester(student1, 3);
        gl2.rateSecondSemester(student1, 3);
        gl2.addStudent(student2);

        GlobalLogicTraining gl3 = new GlobalLogicTraining("JSCourse");
        gl3.addStudent(student1);
        gl3.rateFirstSemester(student1, 5);
        gl3.rateSecondSemester(student1, 5);
        gl3.addStudent(student2);

        Predicate<Student> predicate = students -> students.firstName.contains("Ihor");

        List<Training> stream = new ArrayList<>(Arrays.asList(gl, gl2, gl3));

       //  TrainingUtils.getStudentEmailsByCondition(stream.stream(), predicate).forEach(System.out::println);
       // Map<String, List<String>> trainingsPerStudent = TrainingUtils.getTrainingsPerStudent(stream.stream());
       // System.out.println(trainingsPerStudent);
//        Map<String, Double> averageMarkPerStudent = TrainingUtils.getAverageMarkPerStudent(stream.stream());
//        System.out.println(averageMarkPerStudent);




    }

}
