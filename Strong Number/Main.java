import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in =new Scanner(System.in);
        int n=in.nextInt();
      int g=n;
      int j;
      int p;
      int s=0;
      while(g!=0)
      {
        p=1;
        j=g%10;
        for(int i=1;i<=j;i++){
        p=p*i;
        }
        s+=p; 
        g=g/10;
	}
      if(n==s)
           System.out.println("Yes");   
      else
           System.out.println("No");   
    }

        
}