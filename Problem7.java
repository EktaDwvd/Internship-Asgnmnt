import java.util.Scanner;
public class Problem7 {
	  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print(" rate of retail inflation (in percentage): ");
	       
      double inflationRate = scanner.nextDouble() / 100.0;
	        System.out.print("number of years: ");
	       int numberOfYears = scanner.nextInt();
	        scanner.close();
	        
	    double compoundedInflation = Math.pow(1 + inflationRate, numberOfYears);
	    double roundedInflation = Math.round((compoundedInflation - 1) * 100);
System.out.printf("The compounded inflation after %d years is %.2f%%\n", numberOfYears,roundedInflation) ;
	        
	    }
	}



