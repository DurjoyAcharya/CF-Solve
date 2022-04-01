package Codeforces;




public class DivPlusMod {
    private static final java.util.Scanner sc=new java.util.Scanner(System.in);
    public void Solve()
    {
        int t= sc.nextInt();
        while (t>0)
        {



            t--;
        }




        sc.close();
    }

    public static void main(String[] args) {
        var arr=new java.util.ArrayList<Integer>();
        for (int i = 1; i <=1000000000; i++) {
          int _temp=((i/1000000000)+i)%1000000000;
          arr.add(_temp);
        }
        arr.forEach(System.out::println);
        int max=arr.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
