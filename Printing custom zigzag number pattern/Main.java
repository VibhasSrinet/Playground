import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int c=0;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(c%2==0)
          {
            if(j==n)
              System.out.print(i+1);
            else
               System.out.print(i);
          }
          else
          {
            if(j==1)
              System.out.print(i+1);
            else
               System.out.print(i);
          }
          c++;
        }
        System.out.print("\n");
      }
    }
}
          
          