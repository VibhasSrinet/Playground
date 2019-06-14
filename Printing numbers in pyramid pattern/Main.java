import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	 Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int num=0;
      for(int i=1;i<=n;i++)
      {
        for(int j=n-i;j>=1;j--)
        {
         System.out.print(" ");

        }
        for(int k=1;k<=i;k++)
        {
          num=num+1;
          System.out.print(num+" ");
        }
        System.out.print("\n");

    }    
}
}