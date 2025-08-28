public class Inheritance1 {
    public static void main(String[] args) {
       Dog dobby = new Dog();
       dobby.eat();
       dobby.legs=4;
       System.err.println(dobby.legs);
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
}

class Dog extends Mammal{
    String breed;
}

//Derived Class
// class Fish extends Animal{
//     int Fins;

//     void swim(){
//         System.err.println("swims in water");
//     }
// }