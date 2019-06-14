import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int f=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
        for(int i=0;i<n;i++)
       {
         for(int j=i+1;j<n;j++)
    {      f=0;
           if(a[j]>a[i])
           {
             for(int k=i+1;k<j;k++)
             {
               if(a[k]>a[j])
                 f=1;
             }
           if(f==0)
             System.out.println(a[i]+","+a[j]+" ");
           }
         }
        }
    
  }
}