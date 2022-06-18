package leetcode;

public class ClimbingStairs70 {

	public static void main(String[] args) {
		System.out.println(climbStairs(44));
	}
	public static int climbStairs(int no) {
		if(no == 0)
			return 1;
		if(no <0)
			return 0;
		return climbStairs(no-1)+climbStairs(no-2);
	}

}
