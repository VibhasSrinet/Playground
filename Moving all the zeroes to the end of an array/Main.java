import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int b[]=new int[n];
      int k=0;
      int j=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]!=0)
        {  b[j]=a[i];
        j++;
      }
     else
       k++;
      }
      for(int i=j;i<n;i++)
        b[i]=0;
      for(int i=0;i<n;i++)
      System.out.print(b[i]+" ");  
    }
}