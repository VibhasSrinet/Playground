import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }
      int b[] = new int[k+1];
      for(int i = 0; i <=k ; i++)
            b[i] = 0;
       for(int i = 0; i < n ; i++)
          b[a[i]]++;
      for(int i = 1; i <=k ; i++)
           System.out.println(i+" "+b[i]);

    }
}