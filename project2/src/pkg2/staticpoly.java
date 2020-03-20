package pkg2;
import java.util.Scanner;
public class staticpoly 
{
  public void sum(int a,int b)
  {
	  int c=a+b;
	  System.out.println("result od sum of two variable is"+c);
  }
  public void sum(int a,int b,int d)
  {
	  int c=a+b+d;
	  System.out.println("result od sum of three variable is"+c);
  }
  public void sum(int a,int b,float d)
  {
	  float c=a+b+d;
	  System.out.println("result od sum of three variable is with float"+c);
  }
  public static void main(String[] args) {
	staticpoly obj=new staticpoly();
	Scanner s=new Scanner(System.in);
	System.out.println("enter value of a");
	int a=s.nextInt();
	System.out.println("enter value of b");
	int b=s.nextInt();
    System.out.println("enter value of c");
 int c=s.nextInt();
System.out.println("enter float value");
 float d=s.nextFloat();
 
    obj.sum(a, b);
    obj.sum(a,b,c);
    obj.sum(a, b,d);
    
	
	
	
}
}
