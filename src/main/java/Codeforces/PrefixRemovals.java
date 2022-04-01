package Codeforces;


//1654B. Prefix Removals
public class PrefixRemovals {
    private static final java.util.Scanner sc=new java.util.Scanner(System.in);
    public static void Prefix()
    {
        String str="abcabc";
        str.chars().mapToObj(x->(byte)x).forEach(x->{
            System.out.print(x+" ");
        });
    }

    public static void main(String[] args) {
//        System.out.println("Hello World");
//        Prefix();

        System.out.println(1|16);
    }
}
