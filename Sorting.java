import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sorting{
       public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(); 
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(2);    //O(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        
        //Sorting
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //Decending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
}
}

