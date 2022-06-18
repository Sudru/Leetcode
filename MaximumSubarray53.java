package leetcode;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.stream.Stream;
/*
Kadane's algorithm 

	=> max sum at each index
		=> if current sum > 0 keep adding and compare with maxSum
		=> else set current sum to 0 and continue the process

# Question

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

*/
public class MaximumSubarray53{

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = Stream.of(reader.readLine().split(","))
							.mapToInt(Integer::parseInt)
							.toArray();
						
		System.out.println(getMaxSum(arr));;
	}

	public static int getMaxSum(int[] arr){
		int maxSum = arr[0];
		int currentSum = 0;
		for(int i=0;i<arr.length;i++){
			currentSum+= arr[i];
			System.out.println(currentSum);
			if(currentSum>maxSum)
				maxSum = currentSum;
			if(currentSum<0)
				currentSum = 0;
		}
		return maxSum;

	}
}