public class Update {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    
    public static int updateIthBit(int n, int i, int newBit) {
        //int clearMask = ~(1 << i);
        //n = n & clearMask;
        n= clearIthBit(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;

    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
