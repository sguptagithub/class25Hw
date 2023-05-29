package class25Hw;

import java.util.ArrayList;
import java.util.HashSet;

public class Student {
    /*
    Create a Set that will hold Objects of Student Type.
    In this set we do not care about the insertion order.
    Each student object should have name and studentID.
    Display name of each student.
         */

        private String name;
        private int studentID;

        public Student(String name, int studentID) {
            this.name = name;
            this.studentID = studentID;
        }

        public String getName() {
            return name;
        }

        public int getStudentID() {
            return studentID;
        }
    }
    class StudentTester{
        public static void main(String[] args) {
            HashSet<Student> studentSet = new HashSet<>();

            Student student1 = new Student("Mary", 438);
            Student student2 = new Student("Angel", 890);
            Student student3 = new Student("Patta", 321);

            studentSet.add(student1);
            studentSet.add(student2);
            studentSet.add(student3);

            for (Student student : studentSet) {
                System.out.println(student.getName());
            }
        }
    }
