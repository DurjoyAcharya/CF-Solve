package LeetCode;


//29. Divide Two Integers
public class DivideTwoInteger {
    public int divide(int dividend, int divisor) {
        if (dividend==0) return 0;
        if(divisor == 1) return dividend;
//        if (divisor==1) return Integer.min((int) ((Math.pow(2,31))-1), (int) Math.max(Math.pow(-2,31),dividend));
//        if (divisor==-1) return Integer.min((int) ((Math.pow(2,31))-1), (int) Math.max(Math.pow(-2,31),-dividend));
//        dividend=Math.abs(dividend);
//        divisor=Math.abs(divisor);
        if (divisor<0)
        {
            if (divisor==Integer.MIN_VALUE)
                return dividend==Integer.MIN_VALUE ? 1:0;
            if (divisor==-1&& dividend==Integer.MIN_VALUE)
                return Integer.MAX_VALUE;
            return -divide(dividend,-divisor);
        }
        if (dividend<0)
        {
            int sum=dividend+divisor;
            if (sum>0)return 0;
            return -1-divide(-sum,divisor);
        }
        if (dividend<divisor) return 0;
        int _divided=dividend;
        int bits=0;
        while ((_divided>>1)>=divisor)
        {
            bits++;
            _divided>>=1;
        }

        return (1<<bits) + divide(dividend-(divisor<<bits),divisor);
    }
    public static void main(String[] args) {
        System.out.println(new DivideTwoInteger().divide(10,-2));
    }
}
