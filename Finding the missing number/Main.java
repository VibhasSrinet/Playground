import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int b[]=new int[n];
      for(int i=0;i<n;i++)
        b[i]=0;
      for(int i=0;i<n;i++)
        b[a[i]-1]=1;
      for(int i=0;i<n;i++)
        if(b[i]==0)
          System.out.print(i+1);
    }
}