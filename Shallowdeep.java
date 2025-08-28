public class Shallowdeep {
    public static void main(String[] args) {
        Student s1 = new Student();                    // constructor overloading
        Student s2 = new Student("Arya");              // constructor overloading
        Student s3 = new Student(123);                 // constructor overloading

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s4 = new Student(s1); // copy constructor

        s1.password = "xyz";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s4.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // slow Copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks= s1.marks;
        // ❌ Shallow copy: this.marks = s1.marks;
        // ✅ Deep copy:
    //     // 
    //     }
    // }

    //deep constructor
     Student(Student s1) {
       marks = new int[3];
       this.name = s1.name;
       this.roll = s1.roll;
       for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
    }
     }

    // Non-parameterized constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called.....");
    }

    // Parameterized constructor (name)
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    // Parameterized constructor (roll)
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
