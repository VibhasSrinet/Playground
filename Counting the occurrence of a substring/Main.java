import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan =new Scanner(System.in);
    String s=scan.nextLine();
    String s1=scan.nextLine();
    int k=1;
    for(int i=0;i<(s.length()-s1.length());i++)
    {
      int ch=1;
      for(int j=0;j<s1.length();j++)
      {
        if(s.charAt(i+j)!=s1.charAt(j))
        {
           ch = 0;
        }
      }
      if(ch==1)
        k++;
    }
      System.out.println(k);  
          

          
  } 
}