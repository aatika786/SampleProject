package FirstPackage;

public class B extends A {
	
	private void M2()
	{
		System.out.println("M2 method from class B");
	}
	public static void main(String[] args)
	{
		A a=new A();
		B b=new B();
		b.M2();
		
	}

}
