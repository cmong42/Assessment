package logical_ops;

public class LogicalOpsDemo {
	boolean t = true;
	boolean f = false;
	public static void main(String[] args) {
		LogicalOpsDemo myLogic = new LogicalOpsDemo();
		System.out.println(myLogic.t||myLogic.f);
		System.out.println(myLogic.t&&myLogic.f);
		System.out.println(!myLogic.f);
	}
}
