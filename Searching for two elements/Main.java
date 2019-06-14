import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
         a[i]=in.nextInt();
        int n1=in.nextInt();
        int n2=in.nextInt();
      int l1=-1;
      int l2=-1;
      for(int i=0;i<n;i++)
      { if(a[i]==n1)
          l1=i;
        if(a[i]==n2)
           l2=i;
      }
     System.out.println(l1);
     System.out.println(l2);
      
         
    }
}