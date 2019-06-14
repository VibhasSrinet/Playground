import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int s=0;
      int l=n-1;
      int f=0;
      while(s<l)
      {
        if(a[s]!=a[l])
          f=1;
        if(f==1)
          break;
        l--;
        s++;
      }
      if(f==0)
      System.out.print("Yes");
      else
      System.out.print("No");    
    }
}