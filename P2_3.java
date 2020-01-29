import java.io.*;
import java.util.*;
public class P2_3 {
    public static void main(String args[]) {
      int n,t;
      int rem;
      int rev=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      t=n;
      while(n!=0)
      {
          rem=n%10;
          rev=(rev*10)+rem;
          n=n/10;
      }
      if(t==rev)
      {
          System.out.println(t+" is a palindrome");
      }
      else System.out.println(t+" is not a palindrome");
    }
      
}