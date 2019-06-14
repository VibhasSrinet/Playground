import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
      int count=0;
      int max=0;
     for(int i=0;i<n;i++)
    {
       if(a[i]==1)
         count++;
       if(a[i]==0||i==n-1)
       {
         if(max<count)
           max=count;
         count=0;
     }
       
     } 
      System.out.print(max);   
      
    }
}
