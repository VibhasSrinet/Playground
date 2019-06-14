import java.util.Scanner;
class Main {
	public static void main (String[] args){
       Scanner in =new Scanner(System.in);
	   int n=in.nextInt();
      int s=0;
      int l=n%10;
      while(n!=0)
      {
        if(n<10)
        {
          s=n+l;
        }
        n=n/10;
	}
      System.out.print(s);
    }
}