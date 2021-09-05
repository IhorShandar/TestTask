package java.model;

import java.util.Objects;

/**
 * Student class, represents the student that attends the training
 */
public class Student {

    public String email;

    public String firstName;

    public String lastName;

    public String phoneNumber;

    public Address address;

    /**
     * Allows to get the builder for the Student
     *
     * @param email student's email. Required for each student object construction
     * @return builder
     */
    public static Builder builder(String email) {
        return new Builder(email);
    }


    /**
     * TODO: implement getters and other methods if necessary
     */

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
    }

    /**
     * TODO: implement equals() method for this class
     *
     * @param o object to compare the current object to
     * @return true if students have the same emails, false otherwise
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return this.getEmail().equals(student.getEmail());
    }

    /**
     * TODO: implement hashCode() method for this class using email field
     *
     * @return object hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getEmail());
    }

    /**
     * Builder class is a part of the builder pattern implementation
     * Needed to ease the Student object construction
     * <p>
     * TODO: implement the builder functionality
     */
    public static class Builder {
        Student student = new Student();

        public Builder(String email) {
            student.email = email;
        }

        public Builder firstName(String firstName){
            student.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            student.lastName = lastName;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){
            student.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(Address address){
            student.address = address;
            return this;
        }

        public Student build(){
            return this.student;
        }

    }
}
