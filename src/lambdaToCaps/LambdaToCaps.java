package lambdaToCaps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaToCaps {


	public static List<String> listToUpper(List<String> stringList) {
		
		return stringList.stream().map(stringUpper -> stringUpper.toUpperCase()).collect(Collectors.toList());
	}
	
	public static void main (String args[]) {

		List<String> stringList = new ArrayList<String>(3);
		stringList.add("Hello");
		stringList.add("It's");
		stringList.add("Dale");
		
		listToUpper(stringList);
		
	}
	
}
