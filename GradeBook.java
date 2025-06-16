class Student {
    private String name;
    private int rollNumber;
    private double[] marks;

    public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    public double calculateAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return marks.length > 0 ? total / marks.length : 0;
    }
}

class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent(String name, int rollNumber, double[] marks, String thesisTopic) {
        super(name, rollNumber, marks);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

    public void printThesisTitle() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class GradeBook {
    public static void main(String[] args) {
        Student student = new Student("Khatri", 101, new double[]{85, 90, 78});
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Average Marks: " + student.calculateAverage());

        GraduateStudent graduateStudent = new GraduateStudent("Thapa", 102, new double[]{88, 92, 85}, "Artificial Intelligence");
        System.out.println("\nGraduate Student Name: " + graduateStudent.getName());
        System.out.println("Roll Number: " + graduateStudent.getRollNumber());
        System.out.println("Average Marks: " + graduateStudent.calculateAverage());
        graduateStudent.printThesisTitle();
    }
}
