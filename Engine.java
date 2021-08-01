import java.util.Scanner;
class Engine{
	public static void main(String...args){
	var sc=new Scanner(System.in);
	System.out.println("Enter value to find nth fibonacci"); 
	int n=sc.nextInt();
		System.out.println("Value "+fib(n));
		
	}
static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
}