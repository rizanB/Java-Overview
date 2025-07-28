package OOP;

public class SuperExample {
    public static void main(String[] args) {
        Person p1 = new Person("Roshan", "Kunwar");
        p1.showName();

        Student s1 = new Student("Ramro", "Manche", 1.1);
        s1.info();
        s1.showName();
    }
}

class Person {
    final String firstName;
    final String lastName;

    Person(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    void showName() {
        System.out.println(firstName +" "+ lastName);
    }
}

class Student extends Person {
    final double gpa;

    Student(String fName, String lName, double gpa) {
        super(fName,lName);
        this.gpa = gpa;
    }

    void info() {
        System.out.println(firstName+lastName+gpa);
    }

}