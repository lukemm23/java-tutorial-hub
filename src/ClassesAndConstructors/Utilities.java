package ClassesAndConstructors;

public class Utilities {
	public static boolean nullSafeEquals(Object one, Object two) {
		// this code is not correct
		
//		if(one == null) {
//			return two == null;
//		}else {
//		return one.equals(two);
//		}
		
		//ternary operator
		return one == null ? two == null : one.equals(two);
	}
}
