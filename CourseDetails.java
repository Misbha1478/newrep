class Info {
    String course;
    int sem;
    int marks;

    // Constructor
    Info(String course, int sem, int marks) {
        this.course = course;
        this.sem = sem;
        this.marks = marks;
    }

    // Display method
    void show() {
        System.out.println("Course is: " + course);
        System.out.println("Semester is: " + sem);
        System.out.println("Marks is: " + marks);
    }
}

public class CourseDetails {
    public static void main(String[] args) {
        // Creating objects of Info class
        Info i = new Info("Devops", 4, 50);
        Info i1 = new Info("Java", 4, 40);
        Info i2 = new Info("BDA", 4, 50);

        // Calling the show method for each object
        i.show();
        i1.show();
        i2.show();
    }
}
