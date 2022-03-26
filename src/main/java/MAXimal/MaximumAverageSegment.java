package MAXimal;

//ref: https://e-maxx.ru/algo/maximum_average_segment

public class MaximumAverageSegment {
    public void Algorithm_1(int[] arr)
    {
        int ans=arr[0];
        int sum=0;
        int min_sum=0;
        for (int i = 0; i < arr.length; ++i) {
            sum+=arr[i];
            ans=Math.max(min_sum,sum-min_sum);
            min_sum=Math.min(min_sum,sum);
        }
        System.out.println("Answer: "+ans);
        System.out.println("Sum: "+sum);
        System.out.println("Min_Sum: "+min_sum);
    }
}
