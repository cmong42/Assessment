package Array;

public class Odd_Numbers {
	int[] myList = {7, 12, 34, 11, 78, 90};
	public void isOdd() {
	for (int i = 0; i<myList.length; i++) {
		if (myList[i]%2!=0) {
			System.out.println(myList[i]+" is odd.");
		}else {
			System.out.println(myList[i]+" is not odd.");
		}
	}
	}
	public static void main(String[] args) {
		Odd_Numbers myNumbers = new Odd_Numbers();
		myNumbers.isOdd();
	}
	
}
