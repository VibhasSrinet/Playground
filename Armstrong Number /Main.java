import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in =new Scanner(System.in);
        int n=in.nextInt();
      int k=0;
      int g=n;
      int s=0;
      int j;
      while(g!=0)
      {
        g=g/10;
        k++;
	}
      g=n;
      int p;
      int l;
      while(g!=0)
      {
        l=1;
        p=k;
        j=g%10;
        while(p!=0)
        {
          p--;
          l=l*j;
           }
        s+=l;
        g=g/10;
	}
      if(n==s)
       System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
     
}
}