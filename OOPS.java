public class OOPS {
    public static void main(String[] args) {
        Pen p1= new Pen();// created pen object call p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1 set colour('yellow')
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

//         BankAccount myAcc= new BankAccount();
//         myAcc.username="AryaPadole";
//         myAcc.setPassword("abcdefgh");
    }
 }
// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password=pwd;
//     }
// }
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color= newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }

    String getColor(){
        return color;
    }
    int getTip(){
        return tip;
    }
}

// class Student{
//     String name;
//     int age;
//     float percentage;

//     void calcPercentage(int phy, int chem, int math){
//         percentage=(phy+chem+math)/3;
    