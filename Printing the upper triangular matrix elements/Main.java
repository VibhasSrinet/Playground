import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
         a[i][j]=sc.nextInt();
      }
    }
    int k=0;
    while(r>0)
    {
      for(int i=0;i<r;i++)
    {
      for(int j=k;j<c;j++)
      {
          if((i+k)==j)
        System.out.print(a[i][j]+" ");  
      }
      }
      k++;
      r--;
    }
  }
}