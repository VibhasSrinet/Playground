import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String s1=sc.nextLine();
    for(int i=0;i<s.length();i++)
    {
      int l=0;
      for(int k=0;k<s1.length();k++)
      { 
      if(s.charAt(i)==s1.charAt(k))
        l=1;
      }
      if(l==0)
        System.out.print(s.charAt(i));
        
    }
        
        
  }
}