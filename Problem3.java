import java.util.Scanner;

public class Problem3 {
public static void main(String[] args) {
	int x;
	int y;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a Ist number");
	x=sc.nextInt();
	System.out.println("enter a IInd number");
	y=sc.nextInt();
	sc.close();
	System.out.println("maximum num:" +Math.max(x, y));
}
}
