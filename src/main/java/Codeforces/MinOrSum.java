package Codeforces;


//1635A. Min or Sum
public class MinOrSum {
    private static final java.util.Scanner sc=new java.util.Scanner(System.in);
    public void Solve(int test)
    {
        Integer[] arr;
        int ans=0;
        while (test>0)
        {
            int size= sc.nextInt();
            arr=new Integer[size];
            for (int i = 0; i <size; i++)
                arr[i]= sc.nextInt();
             java.util.List<Integer> num=java.util.Arrays.asList(arr);
            ans= num.stream().reduce(0,(a,b)->a | b);
            System.out.println(ans);
            test--;
        }
    }
    public static void main(String[] args) {
        new MinOrSum().Solve(sc.nextInt());
    }
}

