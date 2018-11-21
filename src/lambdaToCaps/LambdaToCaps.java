package lambdaToCaps;

import java.util.ArrayList;
import java.util.List;

public class LambdaToCaps {


	public static void main (String args[]) {

		List<String> stringList = new ArrayList<String>(3);
		stringList.add("Hello");
		stringList.add("It's");
		stringList.add("Dale");
		
		stringList.stream().map(stringUpper -> stringUpper.toUpperCase()).forEach(System.out::println);
		
	}
	
}
