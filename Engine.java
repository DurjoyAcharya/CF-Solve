import java.util.Scanner;
class Engine{
	public static void main(String...args){
	var sc=new Scanner(System.in);
<<<<<<< HEAD
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
=======
	System.out.println("Enter value to find factorial"); 
	int n=sc.nextInt();
	System.out.println("value "+factorial(n));
		
	}
static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }
>>>>>>> Dhaka
}