package LeetCode;

public class L_ReverseBits {
    public static int reverseBits(int n) {
        int rev=0;
        for(int i=1;i<=32;++i)
        {
            rev=(rev<<1);
            rev|=n&1;
            n=n>>1;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverseBits(110));
////        int n=964176192;
//        System.out.println(n);
    }
}
