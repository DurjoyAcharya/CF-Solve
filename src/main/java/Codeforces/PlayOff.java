package Codeforces;

//problem 1651A
public class PlayOff {
    private static final java.util.Scanner sc=new java.util.Scanner(System.in);
    public void Solve()
    {
        int temp= sc.nextInt();
        for (int i = 0; i < temp; i++) {
            int n= sc.nextInt();
            System.out.println((int)(Math.pow(2,n))-1);
        }
    }
    public static void main(String...r)
    {
        new PlayOff().Solve();

    }

}
