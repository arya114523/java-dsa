import java.util.ArrayList;

public class Multiplelist {

    public static void swap(ArrayList<Integer>list, int idx1, int idx2) {
           int temp = list.get(idx1);
           list.set(idx1, list.get(idx2));
           list.set(idx2, temp);
       }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);

         ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<mainList.size(); j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
