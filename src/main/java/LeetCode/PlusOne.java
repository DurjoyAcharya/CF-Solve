package LeetCode;

import java.util.Arrays;

//da-durjoy@outlook.com
//66 Plus One
//LeetCode Problem
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int lim = digits.length-1;
        digits[lim]+=1;
        if (digits[lim]<=9)
            return digits;
        for (int i = lim; i >0 ; i--) {
            digits[i-1]+=digits[i]/10;
            digits[i]=digits[i]%10;
        }
        if (digits[0]>9)
        {
            int[] arr=Arrays.copyOf(digits,digits.length+1);
            arr[0]=arr[0]/10;
            arr[1]=arr[1]%10;
            return arr;
        }
        return digits;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{99})));
    }
}
