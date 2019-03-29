package leetCode;
/**
 * 判断是否是回文数（12321） 3223--> 10-->3 100-->23-->2 1000-->223-->2 ------------>3
 * 
 * @author Han 1.数学运算判断 2.转化成字符串判断
 *
 */
public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0))
			return false;
		int rev = 0;
		while (x > rev) {
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		return (x == rev || x == rev / 10);
	}
}