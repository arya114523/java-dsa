import java.util.ArrayList;
public class Size{
       public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(); 
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);    //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);



    //print the arraylist
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
}
}
