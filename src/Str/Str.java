package Str;

import java.util.*;

class Soultion344 {
	public void reverseString(char[] s) {
		for (int i = 0, k = s.length-1; i < k; i++) {
			char temp = s[i];
			s[i] = s[k];
			s[k--] = temp;
		}
	}
}

class Solution412 {
	public List<String> fizzBuzz(int n) {
		LinkedList<String> str = new LinkedList<String>();
		int i = 1;
		while (i <= n) {
			if(i%3 == 0 && i%5 == 0){
				str.add("FizzBuzz");
			}
			else if(i%3 == 0) {
				str.add("Fizz");
			}
			else if(i%5 == 0) {
				str.add("Buzz");
			}
			else {
				str.add(i + "");
			}
			i++;
		}
		return str;
	}
}

class Solution242 {
	public boolean isAnagram(String s, String t) {
		char[] schar = s.toCharArray();
		char[] tchar = t.toCharArray();
		Arrays.sort(schar);
		Arrays.sort(tchar);
		if(String.copyValueOf(schar).equals(String.copyValueOf(tchar))) {
			return true;
		}
		return false;
	}
}

class Solution217 {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i : nums) {
			s.add(i);
		}
		if(s.size() != nums.length) {
			return true;
		}
		return false;
	}
}

class Solution387 {
	public int firstUniqChar(String s) {
		int[] stor = new int[127];
		int result = -1;
		int size = s.length();
		for (int i = 0; i < size; i++) {
			stor[s.charAt(i)]++;
		}
		for (int i = 0; i < size; i++) {
			if(stor[s.charAt(i)] == 1) {
				result = i;
				break;
			}
		}
		return result;
	}
}

class Solution371 {
	public int getSum(int a, int b) {
		return Math.addExact(a,b);
	}
}

class Solution171 {
	public int titleToNumber(String s) {
		int length = s.length();
		int sum  = 0;
		for (int i = length - 1, j = 0; j < length ; i--, j++) {
			sum += ((int)s.charAt(i) - 64)*Math.pow(26,j);
		}
		return sum;
	}
}


public class Str {
	public static void main(String[] args) {
		char testcase[] = {'h', 'e', 'l', 'l', 'o'};
		Soultion344 soultion344 = new Soultion344();
		soultion344.reverseString(testcase);
		Solution412 solution412 = new Solution412();
		solution412.fizzBuzz(1);
		int testcase1[] = {1,2,3,1,4};
		Solution217 solution217 = new Solution217();
		solution217.containsDuplicate(testcase1);
		String s = "leetcode";
		Solution387 solution387= new Solution387();
		solution387.firstUniqChar(s);
		String test = "AA";
		Solution171 solution171 = new Solution171();
		solution171.titleToNumber(test);

	}

}
