public class OddandEven{

    public static void OddorEven(int n) {
        int bitMask=1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }

    }
    public static void main(String[] args) {
        OddorEven(3);
        OddorEven(11);
        OddorEven(14);
    }
}
