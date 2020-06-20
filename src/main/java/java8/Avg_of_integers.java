package java8;

import java.util.*;

public class Avg_of_integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Average of first 20 natural numbers : ");
		int intArray[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for(int i = 0;i < 20;i++)
		{
			intList.add(intArray[i]);
		}
		
		double avg = Avg(intList);
		
		System.out.println(avg);
		
	}

	private static double Avg(ArrayList<Integer> intList) {
		// TODO Auto-generated method stub
		double sum = 0;
		
		for(Integer i : intList)
			sum += i;
		
		return sum / (double)intList.size();
	}

}
