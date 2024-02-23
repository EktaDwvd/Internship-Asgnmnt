import java.util.Arrays;

public class Problem10 {
	private static int secondSmallestnum(int num []) {
		Arrays.sort(num);
		return num[1];
	}
public static void main(String[] args) {
	int num []= {1,6,5,4,8,9,33,54};
	System.out.println("second smallest: "+secondSmallestnum(num));
}


}
