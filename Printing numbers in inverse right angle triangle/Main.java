import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in =new Scanner(System.in);
      int n=in.nextInt();
        for(int j=n;j>=1;j--)
        {
          for(int i=j;i>=1;i--)
          System.out.print(i);
          System.out.print("\n");

        }
	}
}