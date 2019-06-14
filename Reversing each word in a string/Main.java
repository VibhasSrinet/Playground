import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String str[]=s.split(" ");
    StringBuilder st=new StringBuilder("");
    for(int j=0;j<str.length;j++)
    {
    for(int i=str[j].length()-1;i>=0;i--)
    {
      st.append(str[j].charAt(i));
     }
    st.append(" ");
    }
     System.out.print(st);
  }
}