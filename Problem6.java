
public class Problem6 {
public static void main(String[] args) {
	String[] words= {"Sunshine","Umbrella","Major","Resourceful"};
	for(String word: words) {
		System.out.println(word +" in "+"present vowels are:"+ vowelwords(word));
	}
}

private static int vowelwords(String word) {
int count=0;

for(int i=0;i<word.length();i++) {
	
	   char ch = Character.toLowerCase(word.charAt(i));

	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		count++;
	}else if(count>=5) {
		System.out.println(word);
	}
  }
   return count;
 }
}