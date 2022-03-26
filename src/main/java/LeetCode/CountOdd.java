package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

//1523. Count Odd Numbers in an Interval Range
public class CountOdd {
    public static int countOdds(int low, int high) {
        int total=(high-low)+1;
        if (low%2 !=0 && high%2 !=0 )
            return (total/2)+1;
        return total/2;
    }
    public static void main(String[] args) {
//        System.out.println(countOdds(3,8));
//        System.out.println(search(new int[]{-1,2,3,4,5},-1));
       // System.out.println(Arrays.stream(new int[]{1,8,6,2,5,4,8,3,7}).sum());
        double a=15.5;
        System.out.println(a%1==0);

    }
    public static int search(int[] nums, int target) {
        return java.util.Arrays.binarySearch(nums,target);
    }

}
