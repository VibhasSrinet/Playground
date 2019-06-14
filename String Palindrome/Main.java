import java.util.Scanner;
class Main{
    public static void main(String args[]) {
         Scanner scan =new Scanner(System.in);
    String s=scan.nextLine();
      int f=0;
      int e=s.length()-1;
      int k=1;
      while(f<e)
      {
        if(s.charAt(f)!=s.charAt(e))
        {
          k=0;
          break;
        }
        f++;
        e--;
      }
      if(k==1)
        System.out.println("Yes");  
      else
        System.out.println("No");  
          
    } 
}