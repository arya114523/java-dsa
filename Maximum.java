import java.util.ArrayList;
public class  Maximum {
       public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(); 
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(2);    //O(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<list.size();i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("max element is = " + max);
}
}