// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	int currentValue = Integer.parseInt(args[0]);
	double intrest = Double.parseDouble(args[1]);
	int years = Integer.parseInt(args[2]);
	intrest = (intrest / 100 );
	double tottalValue = currentValue * (Math.pow( 1 + intrest, years));
	intrest = ( intrest * 100 );
	System.out.println( "After " + years + " years," + " a" + " $" + currentValue + " saved at " + intrest + "%" + " will yield" + " $" + (int)tottalValue);	
	}
}