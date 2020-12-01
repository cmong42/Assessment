package bitwise_ops;

public class BitwiseOpsDemo {
	int a = 1;
	int b = 2;
	int and = a&b;
	int or = a|b;
	int xor = a^b;
	public static void main(String[] args) {
		BitwiseOpsDemo myBitwise = new BitwiseOpsDemo();
		System.out.println("And Operator: "+myBitwise.and);
		System.out.println("Or Operator: "+myBitwise.or);
		System.out.println("Xor Operator: "+myBitwise.xor);
		
	}
}
