import java.util.Scanner;
class Main
{
  public static int fact(int n){
    if(n==1)
      return 1;
     return n*fact(n-1);
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int f=fact(n);
    System.out.print(f);
  }
}
