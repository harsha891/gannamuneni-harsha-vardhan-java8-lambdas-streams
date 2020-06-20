package java8;

import java.util.*;
import java.util.function.Predicate;

public class Find_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"hello", "madam" , "sir", "anna", "tech", "java", "abba", "canal", "123321", "api", "14543", "RRR", "eclipse", "assa"};
		
		List<String> strList = Arrays.asList(strArray);
		
		List<String> palindromes = findPalindromes(strList,IntPredicate::checkPalindrome);
		
		System.out.println("List of Palindromes : " + palindromes);
	}

	private static List<String> findPalindromes(List<String> strList, Predicate<String> predicate) {
		// TODO Auto-generated method stub
		List<String> resList = new ArrayList<String>();
		
		for(String str : strList)
			if(predicate.test(str))
				resList.add(str);
		return resList;
	}
}

class IntPredicate{
	
	public static boolean checkPalindrome(String str)
	{
		for(int i = 0,j = str.length()-1;i < j;i++,j--)
			if(str.charAt(i) != str.charAt(j))
				return false;
		return true;
	}

}
