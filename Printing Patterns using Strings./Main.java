import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int m=(s.length()-1)/2;
    for(int i=0;i<s.length();i++)
    {
      m=(s.length()-1)/2;
      for(int j=s.length()-1;j>i;j--)
      {
        System.out.print(" ");
      }
      for(int k=0;k<=i;k++)
      {
        System.out.print(s.charAt(m));
        m=(m+1)%(s.length());
      }
       System.out.print("\n");
       }
  }
}