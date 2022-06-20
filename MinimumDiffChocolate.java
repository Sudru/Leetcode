import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.*;
import java.util.*;
import java.io.IOException;
public class MinimumDiffChocolate{

/*
Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Example 1:

Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between 
maximum chocolates and minimum chocolates 
is 9 - 3 = 6 by choosing following M packets :
{3, 4, 9, 7, 9}.

*/

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(reader.readLine());
		ArrayList<Integer> arr = Stream.of(reader.readLine().split(" "))
							.mapToInt(Integer::parseInt)
							.boxed().collect(Collectors.toCollection(ArrayList::new));

		Collections.sort(arr);
		System.out.println(getMinDiff(arr,m));


	}
	public static int getMinDiff(ArrayList<Integer> arr,int m){
		int i = 0;
		int min = arr.get(arr.size()-1);
		while(i+m<=arr.size()){
			int temp = arr.get(i+m-1)-arr.get(i);
			System.out.println(temp);
			if(temp<min)
				min=temp;

			i++;	
		}
		return min;
	}

}