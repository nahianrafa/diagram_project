
package com.mycompany.projecttttt;


public class Mainnnnnn {
    public static void main(String[] args) {
        CourseRegistrationManager manager = new CourseRegistrationManager();

        Student s1 = new Student("S1001", "Alice", "alice@example.com");
        Account acc1 = new Account("alice01", "pass123", s1);

        Course c1 = new Course("CS101", "Intro to CS", 4);
        Course c2 = new Course("MA101", "Calculus I", 3);

        manager.addStudent(s1);
        manager.addCourse(c1);
        manager.addCourse(c2);

        manager.registerStudentForCourse(s1, c1, "Fall 2025");
        manager.registerStudentForCourse(s1, c2, "Fall 2025");

        for (Registration r : manager.getRegistrations()) {
            System.out.println("Student: " + r.getStudent().name + " - Course: " + r.getCourse().getCourseName());
        }
    }
}

}
