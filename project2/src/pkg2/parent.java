package pkg2;

public class parent 
{
  public parent()
  { 
	  this(78,9,10);
	  System.out.println("parent default constructor");
  }
  public parent(int a)
  { this();
	  System.out.println("parent one parameterized constructor");
  }
  public parent(int a,int b)
  { this(4);
	  System.out.println("parent two parameterized constructor");
  }
  public parent(int a,int b,int c)
  {
	  System.out.println("parent three parameterized constructor");
  }
}
