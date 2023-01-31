import java.lang.Math;
import java.util.Scanner;
class Armstrong 
{ 
    public static void main(String[]args)
    { Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
      int n=s.nextInt();
      int temp=n;
      int count=0;
      double sum=0;
      int rem;
      while(temp>0)
     {  temp=temp/10;
       count=count+1;
     }
      int tempv=n;
      while(tempv>0)
    {  
        rem=tempv%10;
        sum=sum+Math.pow(rem, count);
        tempv=tempv/10;
        
    }
    if (sum==n)
    {
        System.out.print(n+"  is armstrong number");
    } 
    else 
    {
        System.out.println("not a armstrong number");
    }

    s.close();
}
}