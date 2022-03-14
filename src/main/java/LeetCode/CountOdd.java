package LeetCode;

//1523. Count Odd Numbers in an Interval Range
public class CountOdd {
    public static int countOdds(int low, int high) {
        int total=(high-low)+1;
        if (low%2 !=0 && high%2 !=0 )
            return (total/2)+1;
        return total/2;
    }
    public static void main(String[] args) {
        System.out.println(countOdds(3,8));
    }
}
