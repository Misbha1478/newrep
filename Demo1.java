class Student {
    String name;
    String dob;
    int age;

    // Constructor
    Student(String name, String dob, int age) {
        this.name = name;
        this.dob = dob;
        this.age = age;
    }

    // Display method
    void display() {
        System.out.println("Name of the student is: " + name);
        System.out.println("Date of birth of the student is: " + dob);
        System.out.println("Age of the student is: " + age);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        // Create a new Student object
        Student s = new Student("Misbha", "26-08-2005", 19);
        // Call display method
        s.display();
    }
}
