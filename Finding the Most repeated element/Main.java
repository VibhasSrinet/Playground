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
      int max=0;
      int s[]=new int[10];
      for(int i=0;i<10;i++)
        s[i]=0;
      for(int i=0;i<n;i++)
      {
        s[a[i]]++;
      }
      for(int i=0;i<10;i++)
      {
        if(max<s[i])
          max=i;
      }
      System.out.print(max);
    }
}