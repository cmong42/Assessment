package Array;

public class PrimeNumbers {
	public void findPrime() {
		int[] myList = {7, 12, 34, 11, 78, 90};
		for (int i = 0; i<myList.length; i++) {
			int counter = 0;
			for (int x = 1; x<=myList[i]; x++) {
				if (myList[i]%x==0) {
					counter+=1;
				}
			}
			if (counter>2){
				  System.out.println(myList[i]+" is not prime.");
			}else if (counter==2){
			System.out.println(myList[i]+" is prime");
			}
			
		}
	}
	
	public static void main(String[] args) {
		PrimeNumbers result = new PrimeNumbers();
		result.findPrime();
	}
}
