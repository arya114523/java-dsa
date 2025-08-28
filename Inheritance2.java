public class Inheritance2 {
    public static void main(String[] args) {
       Mammal dobby = new Mammal();   // Mammal ka object banaya
        dobby.eat();                   // eat() from Animal
        dobby.walks();                 // walks() from Mammal

        dobby.legs = 4;                // legs assign kiya
        System.out.println(dobby.legs);  // legs print kiya
    }
}

//Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int legs;
    void walks(){
        System.out.println("walks");
    }
}

class Dog extends Mammal {
    int legs;
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}


// class Dog extends Mammal{
//     String breed;
// }

//Derived Class
// class Fish extends Animal{
//     int Fins;

//     void swim(){
//         System.err.println("swims in water");
//     }
// }