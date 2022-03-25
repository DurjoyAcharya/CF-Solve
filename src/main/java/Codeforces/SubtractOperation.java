package Codeforces;


//1656B. Subtract Operation
public class SubtractOperation {
    private static final java.util.Scanner sc=new java.util.Scanner(System.in);
    public void Operation(int[] arr,int size,int target)
    {
        boolean flag=false;
        if (size==1)
            flag=(arr[0]==target);
        else
        {
            java.util.Arrays.parallelSort(arr);
            int i=0,j=1;
            while (j<size && i<size)
            {
                if (arr[i]+Math.abs(target)==arr[j])
                {
                    flag=true;
                    break;
                }else if (arr[i]+Math.abs(target)<arr[j]) ++i;
                else ++j;
            }
        }
        System.out.println(flag ? "YES":"NO");
    }
    public void Solve()
    {
        int[] arr;
        int t=sc.nextInt();
        while (t>0)
        {
            int size=sc.nextInt();
            int target= sc.nextInt();
            arr=new int[size];
            for (int i = 0; i < size; i++)
                arr[i]=sc.nextInt();
            Operation(arr,size,target);
            t--;
        }
    }
    public static void main(String[] args) {
        new SubtractOperation().Solve();
    }
}
