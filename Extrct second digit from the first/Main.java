import java.util.Scanner;
class Main {
	public static void main (String[] args){
       Scanner in =new Scanner(System.in);
	   int n=in.nextInt();
      int k;
      while(n!=0)
      {
        if(n>=10&&n<100)
        {
          k=n%10;
          System.out.print(k);
        }
        n=n/10;
      }
    }
}
            