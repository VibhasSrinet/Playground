import java.util.Scanner;
class Main{
   public static int power(int base,int exp)
   {
    int power=1;
     for(int i=1;i<=exp;i++)
       power*=base;
     return power;
   }
	public static void main (String[] args){
	   Scanner in =new Scanner(System.in);
      int base=in.nextInt();
      int exp=in.nextInt();
      int pow=power(base,exp);
      System.out.print(pow);
	}
}