package Codeforces;
//1A
public class TheatreSquare {
    private static final java.util.Scanner scan=new java.util.Scanner(System.in);
    public static long Solve()
    {
        int n=scan.nextInt();
        int m=scan.nextInt();
        int a=scan.nextInt();
        long length,width,result;
        length=(n%a==0)?(n/a):(n/a+1);
        width=(m%a==0)?(m/a):(m/a+1);
        result=length*width;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Solve());
    }
}
