package Codeforces;


//1637A. Sorting Parts
public class SortingParts {
    private static final java.util.Scanner sc=new java.util.Scanner(System.in);
    public  boolean isSorted(int[] a)
    {
        if (a == null || a.length <= 1) {
            return true;
        }
        return java.util.stream.IntStream.range(0, a.length - 1).noneMatch(i -> a[i] > a[i + 1]);
    }
    public void Solve()
    {
        int[] arr;
        int t=sc.nextInt();
        while (t>0)
        {
            int count=0;
            int size=sc.nextInt();
            arr=new int[size];
            for (int i = 0; i < size; i++) {
                arr[i]= sc.nextInt();
            }
           boolean flag = isSorted(arr);
            if (!flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }

    }
    public static void main(String[] args) {
        new SortingParts().Solve();
    }
}
