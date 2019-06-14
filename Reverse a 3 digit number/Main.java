import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner (System.in);
    int n=in.nextInt();
    int n1,n2,n3;
    n1=n/100;
    n2=(n/10)%10;
    n3=n%10;
                 System.out.println(n3*100+n2*10+n1);


  }
}