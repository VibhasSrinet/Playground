import java.util.Scanner;
public class Main{
  public static int gcd(int n,int m)
    {
    int min;
     if(n>=m)
        min=m;
      else
        min=n;
    while(min>=1)
    {
    if(n%min==0 &&m%min==0)
    {
      break;
    }
      else
        min--;
    }
    return min;
  }
	public static void main (String[] args)
	{
	  Scanner in =new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int gcd1=gcd(n1,n2);
      int gcd2=gcd(gcd1,n3);
      System.out.print(gcd2);
	}
}