public class Problem2 {

 public static double calculateGrossPrice(double netPrice, double taxRate) {
	        return netPrice / (1 + taxRate);
	    }
		public static void main(String[] args) {
	        double[] netPrices = {99.95, 49999.00, 720.00, 45.00};
	        double[] taxRates = {0.12, 0.28, 0.05, 0.00};
	        
	        for (int i = 0; i < netPrices.length; i++) {
	            double grossPrice = calculateGrossPrice(netPrices[i], taxRates[i]);
	        System.out.println("Net Price: " + (netPrices[i]) +
                ", Tax Rate: " + (taxRates[i] * 100) + ", Gross Price: " +(grossPrice));
	   }
	}
}