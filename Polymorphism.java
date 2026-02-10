
class Student {

    void study() {
        System.out.println("Student is studying");
    }
}

class EngineeringStudent extends Student {

    // Method overriding
    void study() {
        System.out.println("Engineering student is studying Java");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Student s = new EngineeringStudent();

        // Runtime polymorphism
        s.study();
    }
}

// Output: Engineering student is studying Java