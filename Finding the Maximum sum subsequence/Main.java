import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int seq[]=new int[n*2];
    int k=0;
    int start=0;
    for(int i=0;i<n-1;i++)
    {
      if(a[i]>a[i+1])
      {
        seq[k]=start;
        k++;
        seq[k]=i;
        k++;
        start=i+1;
      }}
    seq[k]=start;
        k++;
        seq[k]=n-1;
        k++;
    int max=0;
    int s=0;
for(int i=0;i<k;i+=2)
{
     int st=seq[i];
    int e=seq[i+1];
  s=0;
  for(int j=st;j<=e;j++)
  {
    s+=a[j];
  }
  if(max<s)
    max=s;
  
}
    System.out.print(max);
  }
}