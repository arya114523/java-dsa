public class OOPS2 {
    public static void main(String[] args) {
        Student s1= new Student();                     //constructor overloading
        Student s2= new Student("Arya");          //constructor overloading
        Student s3= new Student(123);             //constructor overloading
        //.out.println(s1.name);
    }
}
 
class Student{
    String name;
    int roll;

    Student(){ //String name
    //     //this.name = name;
         System.out.println("Constructor is called.....");
    }

    //parameterized constructor
    Student(String name){
        this.name = name;
    }

    Student(int roll) {
        this.roll=roll;
    }
    
   

    
}