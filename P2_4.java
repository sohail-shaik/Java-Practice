import java.io.*;
import java.util.*;
public class P2_4 {
    public static void main(String args[]) {
      int n,sum=0;
      int rem;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(n!=0)
      {
          rem=n%10;
          sum=sum+rem;
          n=n/10;
          
      }
          System.out.println(sum);
     
    }
      
}