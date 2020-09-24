package relational_ops;

public class RelationalOpsDemo {
	int num1 = 789;
	int num2 = 345;
	public static void main(String[] args) {
		RelationalOpsDemo myRelational = new RelationalOpsDemo();
		System.out.println("The following will be true: ");
		System.out.println(myRelational.num1>myRelational.num2);
		System.out.println(myRelational.num2<myRelational.num1);
		System.out.println(myRelational.num2<=myRelational.num2);
		System.out.println(myRelational.num1!=myRelational.num2);
		
	}
}
