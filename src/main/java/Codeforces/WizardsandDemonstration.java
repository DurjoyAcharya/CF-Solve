package Codeforces;
//problem number 168A
public class WizardsandDemonstration {
    private static final java.util.Scanner sc=new java.util.Scanner(System.in);
    public void Solution()
    {
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int total= (int) Math.ceil(((double) y/100)*n);
        if (total>x)
            System.out.println(total-x);
        else
            System.out.println(0);
    }
    public static void main(String[] args) {
        new WizardsandDemonstration().Solution();
    }
}
