public class Problem5 {
	   
	    public static double calculateIncomeTax(double income) {
	        double tax;
	        if (income <= 250000) {
	            tax = 0;
	        } else if (income <= 500000) {
	            tax = (income - 250000) * 0.1;
	        } else if (income <= 1000000) {
	            tax = 25000 + (income - 500000) * 0.2;
	        } else {
	            tax = 125000 + (income - 1000000) * 0.3;
	        }
	        return tax;
	    }
	    
	    public static void main(String[] args) {
	        double[] incomes = {190000, 345000, 780000, 2400000};

	        for (double income : incomes) {
	            double tax = calculateIncomeTax(income);
	            System.out.println("Income: Rs." + income + ", Income Tax:" + tax);
	        }
	    }
	}

	


