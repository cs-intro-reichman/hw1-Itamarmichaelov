// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int a = (int) ((Math.random())*100);
	int b = (int) ((Math.random())*100);
	int c = (int) ((Math.random())*100);
	int max =(int)Math.max(Math.max(a,b),c);
	int min =(int)Math.min(Math.min(a,b),c);
	int middle = (a + b + c)-(max)-(min);    
	System.out.println(a + " " + b + " "+ c);
	System.out.println(min + " " +middle + " " + max);	
	}
}
