package Codeforces;


//4A
public class Watermelon {
    public static final java.util.Scanner sc=new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int test= sc.nextInt();
        if(test > 2 && test % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
