package conditional_ops;

public class ConditionalOpsDemo {
	int five = 5;
	int seven = 7;
	boolean caseone = five==seven;
	boolean casetwo = five<seven;
	
	public static void main(String[] args) {
		ConditionalOpsDemo myConditional = new ConditionalOpsDemo();
		System.out.println(myConditional.caseone);
		System.out.println(myConditional.casetwo);
	}

}
