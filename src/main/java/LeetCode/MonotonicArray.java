package LeetCode;

//896. Monotonic Array

import java.util.Arrays;

public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        boolean flag=false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i]<nums[j])
                    flag=true;
            }
        }
        return flag;
    }

//    public static void main(String[] args) {
//        System.out.println(isMonotonic(new int[]{1,2,2,2,3,5}));
//    }
}
class StretchedString {

    public static void main(String[] args) {
        String accessLevel = "user";
        if (accessLevel != "user‮ ⁦// Check if admin⁩ ⁦") {
            System.out.println("You are an admin.");
        }
    }

}