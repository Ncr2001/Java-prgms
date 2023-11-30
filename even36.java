import java.util.Scanner;
class even36
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a starting number");
int m=sc.nextInt();
System.out.println("enter a ending number");
int n=sc.nextInt();
System.out.println("============================");
while(m<=n)
{
if(m%2==0)
{
System.out.println(m);
}
m++;
}
}
}