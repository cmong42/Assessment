package Example1;

public class FloatDoubleLongExample1 {
	public static void main(String[] args) {
	String myString = "99";
	
	float myFloat = Float.parseFloat(myString);
	Float myObject = myFloat;
	Float myFloatObject = myObject.floatValue();
	System.out.println(myFloatObject+ " is a Float Object");
	
	double myDouble = Double.parseDouble(myString);
	Double myObject1 = myDouble;
	Double myDoubleObject = myObject1.doubleValue();
	System.out.println(myDoubleObject+ " is a Double Object");
	
	long myLong = Long.parseLong(myString);
	Long myObject2 = myLong;
	Long myLongObject = myObject2.longValue();
	System.out.println(myLongObject+ " is a Long Object");
	
	}
}
