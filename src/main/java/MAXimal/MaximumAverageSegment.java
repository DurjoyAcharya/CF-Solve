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
    public void Algorithm_FUllVersion(int[] arr)
    {
        int ans=arr[0];
        int ans_1=0;
        int ans_r=0;
        int sum=0;
        int min_sum=0;
        int min_pos=-1;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            int cur=sum-min_sum;
            if(cur>ans)
            {
                ans=cur;
                ans_1=min_pos+1;
                ans_r=i;
            }
            if (sum<min_sum)
            {
                min_sum=sum;
                min_pos=i;
            }
        }
        System.out.println("Answer: "+ans);
        System.out.println("Answer 1: "+ans_1);
        System.out.println("Answer r: "+ans_r);
        System.out.println("Minimum Position: "+min_pos);
        System.out.println("Sum: "+sum);
        System.out.println("Min Sum: "+min_sum);
    }
}
