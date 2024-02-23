import java.util.Arrays;
public class Problem4 {
	

	    public static void main(String[] args) {
	        double[][] arrays = {
	            {10.7},
	            {1.0, 2.0, 3.0},
	            {17.4, 21.1, 39.7, 48.0},
	            {-957.0, -493.0, -384.0, -268.0, -131.0},
	            {} 
	        };

	        for (double[] arr : arrays) {
	            double median = findMedian(arr);
	            System.out.println("Array: " + Arrays.toString(arr) + ", Median: " + median);
	        }
	    }

	    public static double findMedian(double[] nums) {
	        int n = nums.length;
	        if (n == 0) {
	            return -1.0; 
	        }
	        Arrays.sort(nums); 

	        int mid = n / 2;
	        if (n % 2 == 0) {
	            return (nums[mid - 1] + nums[mid]) / 2.0;
	        } else {
	            return nums[mid];
	        }
	    }
	}


