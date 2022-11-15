import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		//Read in the amount paid
		//Print out the amount of change
		//Break the change into all denominations: 
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
//		System.out.println("Enter a payment");
//		double payment = in.nextDouble();
//		System.out.println("You paid $"+Math.round(payment*100)/100.0);
		
		//How do you get just one digit? HINT: %
		double change = 123.44;
		//shift the decimal place by 2, use the modulus. Make sure it's an int.
		int lastDigit = (int)((change*100)%10);
		//if output is 1 or 2 or 6 or 7, round down.
		if (lastDigit==1 || lastDigit==2) {
			change = change-(lastDigit/100.0);
		}else if (lastDigit==3 || lastDigit==4) {
			change = change + ((5-lastDigit)/100.0);
		}
		System.out.println(change);
		
	}

}
