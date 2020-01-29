import java.io.*;
import java.util.*;
public class P2_6
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=fact(n);
		System.out.println("factorial of "+n+" is "+x);
	}
	static int fact(int n)
    {
    if(n>=1)
    {
        return n*fact(n-1);
    }
    else
    {
        return 1;
    }
    }
}

