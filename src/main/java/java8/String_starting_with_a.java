package java8;

import java.util.*;
import java.util.stream.Collectors;

public class String_starting_with_a {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("List of strings starting with 'a' with length 3 from original String: ");
		String[] strArray = {"anchor","bus","ant","api","Api","ants","angel","aid","anchor","App","ash","ale","Room","ape","APE","aPE"};
		
		List<String> strList = Arrays.asList(strArray);
		
		List<String> result = strList.stream().filter((String str) -> {
			return str.charAt(0) == 'a' && str.length() == 3;
		}).collect(Collectors.toList());
		
		System.out.println(result);
		
	}
}
