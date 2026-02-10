
    
// Parent Class
class College {
    String collegeName = "XYZ Engineering College";
    String city= "Pune";

    void showCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + city);
    }
}

// Child Class
class Student extends College {
    int rollNo = 10;
    String studentName = "Vaishnavi";

    void showStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Student Name: " + studentName);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Student s = new Student();
        
        System.out.println("Collage Details : ");
        s.showCollegeDetails();

        System.out.println();
        
        System.out.println("Student Details : ");
        s.showStudentDetails();
    }
}

