package arithmetic_ops;

public class ArithmeticOpsDemo {
	int a = 100;
	int b = 200;
	int c = 300;
	int added = a+b+c;
	int subtracted = c-b-a;
	int modulo = c%b;
	public static void main(String[] args) {
		ArithmeticOpsDemo myArithmetic = new ArithmeticOpsDemo();
		System.out.println("Addition Operator: "+myArithmetic.added);
		System.out.println("Subtraction Operator: "+myArithmetic.subtracted);
		System.out.println("Modulo Operator: "+myArithmetic.modulo);
		
	}

}
