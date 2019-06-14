import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in =new Scanner(System.in);
	   int n=in.nextInt();
      int s=0;
      int k;
      while(n!=0)
      {
        k=n%10;
        n=n/10;
        s=s+k;
	}
            System.out.print(s);
    }
}