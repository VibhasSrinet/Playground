import java.util.Scanner;
class Main{
  public static void prime(int n)
  {
    int f;
    System.out.println(2);
    for(int i=3;i<=n;i+=2)
    {
      f=0;
    for(int j=3;j<i/2;j+=2)
    { 
      if(i%j==0)
    {
        f=1;
    }
    }
    if(f==0)
    System.out.println(i);
    }
  }
	public static void main (String[] args){
	  Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
    }
}