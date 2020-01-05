package Algorithm;


import java.util.HashSet;
import java.util.Set;

class Solution202 {
	public boolean isHappy(int n) {
		Set<Integer> sumSet = new HashSet<>();
		int sum = 0;
		while(sumSet.add(n)) {
			while ( n > 0) {
				int t = n % 10;
				sum += Math.pow(t, 2);
				n/=10;
			}
			if (sum == 1) {
				return true;
			} else {
				n = sum;
			sum = 0;
			}
		}
		return false;
	}
}


class Solution70 {
	public int climbStairs(int n) {
		if(n == 1) {
			return 1;
		}
		else if(n == 2) {
			return 2;
		}
		else {
			return climbStairs(n - 2) + 2 +climbStairs(n -1 ) +1;
		}
	}
}

public class Algorithm {
	public static void main(String[] args) {
		Solution202 solution202 = new Solution202();
		solution202.isHappy(19);
	}
}
