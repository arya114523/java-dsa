import java.util.ArrayList;

public class StackArr{
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop data delete krne se pehele hum usko store krte hai fir return krte hai 
        //jo bhi data delete hota hai vo pop se return hota hai default implementation me
         public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
         }
         //peeks
         public static int peek(){
            if(isEmpty()){
            return -1;
            }
            return list.get(list.size()-1);
         }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
