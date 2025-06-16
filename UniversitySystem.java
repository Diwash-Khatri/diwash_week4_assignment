class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleDetails() {
        return "Person: " + name + ", ID: " + id;
    }
}

class Student extends Person {
    private String program;

    public Student(String name, String id, String program) {
        super(name, id);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String getRoleDetails() {
        return "Student: " + getName() + ", ID: " + getId() + ", Program: " + program;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getRoleDetails() {
        return "Teacher: " + getName() + ", ID: " + getId() + ", Subject: " + subject;
    }
}

class Admin extends Person {
    private String department;

    public Admin(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getRoleDetails() {
        return "Admin: " + getName() + ", ID: " + getId() + ", Department: " + department;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Person[] people = {
            new Student("Ram", "123", "Computer Science"),
            new Teacher("Ronaldo", "456", "Mathematics"),
            new Admin("Sita", "789", "Admissions")
        };

        for (Person person : people) {
            System.out.println(person.getRoleDetails());
        }
    }
}
