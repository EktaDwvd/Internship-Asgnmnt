
public class Problem8 {
	public static void main(String[] args) {
	long seconds=21893872;
	    long sec = seconds % 60;
	    long minutes = seconds % 3600 / 60;
	    long hours = seconds % 86400 / 3600;
	    long days = seconds / 86400;
	    System.out.println( + days+" Days " + hours + " Hour "  + minutes  + " Minute " + sec +" Seconds " );
	}
	}

