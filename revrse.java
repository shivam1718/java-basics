import java.util.*;
class revrse
{
public static void main(String s[])
{
int num,rev=0,r;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number= ");
num=sc.nextInt();
while(num>0)
{
	r=num%10;
	rev=(rev*10)+r;
	num=num/10;
}
System.out.print("Revrse is= "+rev);
}
}
