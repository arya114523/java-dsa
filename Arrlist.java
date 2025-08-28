import java.util.ArrayList;
public class Arrlist {
       public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(); 
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);    //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //Get operation
        int element = list.get(2);  //O(1)
        System.out.println(element);

        //delete operation
        list.remove(2);
        System.out.println(list);

        //Set
        list.set(2,10);
        System.out.println(list);

        //contains 
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

       }
}
