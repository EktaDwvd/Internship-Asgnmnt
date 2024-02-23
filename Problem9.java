import java.util.Scanner;

public class Problem9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number: ");
	int digit= sc.nextInt();
	sc.close();
	int first=digit/10;
	int last=digit%10;
	int sum=first+last;
	System.out.println("digit of sum: "+sum);
	int product=first*last;
	System.out.println("digit of product: "+product);
	int total=sum+product;
	System.out.println("the special two-digit integer obtained as: "+total);
}
}
