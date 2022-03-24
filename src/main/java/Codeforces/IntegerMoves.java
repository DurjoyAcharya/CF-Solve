package Codeforces;



//Problem 1657A Integer Moves
public class IntegerMoves {
    private static final java.util.Scanner sc=new java.util.Scanner(System.in);
    public void solve()
    {
        int t=sc.nextInt();
        while (t>0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int ans=Integer.MIN_VALUE;
            double _temp=(Math.pow(x,2))+Math.pow(y,2);
            int result=0;
            while ((result*result)<_temp) ++result;
            ans=2;

            if ((result*result)==_temp)
                ans=1;
            if (x==0 && y==0)
                ans=0;
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    public static void main(String[] args) {
        new IntegerMoves().solve();
    }
}
