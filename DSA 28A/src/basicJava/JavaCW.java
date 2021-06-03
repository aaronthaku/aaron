package basicJava;

public class JavaCW {
//	Addition
	public int sum(int a, int b) {
		     return a+b;
	}
//	Subtraction
	public int diff(int a, int b) {
	       return a-b;
	}
//	Multiplication
	public int mul(int a, int b) {
		return a*b;
	}
//	Division
	public float div(float a,float b) {
		return a/b;
	}
//	Swapping
	public void swap(int a, int b){
		System.out.println("before swapping");
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		System.out.println("after swapping");
		 int  temp =a;		
		  a=b;
		  b=temp;
		  
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
	}
	
//	Checking prime number
	public boolean prime(int num1){
	    for (int i=2; i<num1;i++){
	        if (num1% i==0){
	            System.out.println("the number is not prime");
	            return false;
	        }
	    }
	    System.out.println("the number is  prime");
	    return true;
	}
	
//	Calling the class
	public static void main(String[] args) {
		JavaCW obj1=new JavaCW();
		System.out.println(obj1.sum(10, 12));
		System.out.println(obj1.diff(12, 8));
		System.out.println(obj1.mul(3, 8));
		System.out.println(obj1.div(8, 1));
		obj1.swap(8, 12);
		obj1.prime(3);
	}

}
