import java.util.Scanner;
class Main{
    public static int large(int n,int m)
    {
      if(n>=m)
        return n;
      else
        return m;
    }
	public static void main (String[] args){
	   Scanner in =new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int l1=large(n1,n2);
      int l2=large(l1,n3);
      System.out.print(l2);
	}
}