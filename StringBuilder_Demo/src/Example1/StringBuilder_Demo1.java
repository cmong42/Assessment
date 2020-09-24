package Example1;

public class StringBuilder_Demo1 {
	public void LastLetterCap() {
	String s = "hello hi how are you doing today ?";
	StringBuilder sb = new StringBuilder();
	String stringList[] = s.split(" ");
	//To convert last character in string to uppercase:
	for (String word:stringList) {
		sb.append(word.substring(0, word.length()-1)+word.substring(word.length()-1).toUpperCase()+" ");
	}
	System.out.println(sb);
	}
	public static void main(String[] args) {
		StringBuilder_Demo1 myString = new StringBuilder_Demo1();
		myString.LastLetterCap();
	}
}
	
