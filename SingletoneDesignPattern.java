package designpattern;

class SingleObject{
	//create object
	private static SingleObject instance=new SingleObject();
	//create private constructor
	private SingleObject()
	{
	
	}
	public static SingleObject getInstance() {
		return instance;
		
	}
	public void show()
	{
		System.out.println("Accecing methad use singe obect");
	}
	
}

public class SingletoneDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //we cant create object of singleobect clasd
		SingleObject obj=SingleObject.getInstance();
		obj.show();
		
	}

}
