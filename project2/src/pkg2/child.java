package pkg2;

public class child extends parent
{
	 public child()
	  { this(3,5);
		  System.out.println("child default constructor");
	  }
	  public child(int a)
	  {  this();
		  System.out.println("child one parameterized constructor");
	  }
	  public child(int a,int b)
	  {   super(56,7);
		  System.out.println("child two parameterized constructor");
	  }
	  public child(int a,int b,int c)
	  {
		  this(3);
		  System.out.println("child three parameterized constructor");
	  } 
	 
	public static void main(String[] args) 
	{
		child c=new child(2,5,8); 
		
	}

}
