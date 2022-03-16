package Codeforces;
//1632 A. ABC
public class ABC {
    private static final java.util.Scanner sc=new java.util.Scanner(System.in);
    public void solve()
    {
        int n=sc.nextInt();
        String str= sc.nextLine();
        if (n==2 && (str.equals("10")) || str.equals("01"))
            System.out.println("YES");
        else if (n==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void main(String[] args) {

            new ABC().solve();
    }
}
